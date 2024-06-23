package Graph;

import java.util.*;

//https://leetcode.com/problems/cheapest-flights-within-k-stops/description/
public class CheapestFlightsWithinKStops {
    class Flight {
        int toCity;
        int price;

        Flight(int toCity, int price) {
            this.toCity = toCity;
            this.price = price;
        }
    }

    class Tuple {
        int stops;
        int city;
        int cost;

        Tuple(int stops, int city, int cost) {
            this.stops = stops;
            this.city = city;
            this.cost = cost;
        }
    }

    //Using normal , queue, and arraylist, idea is to not add any price which is worse than existing
    public void timeEffecientSolution(int numOfCities, int[][] flights, int source, int destination, int maxStops){
        ArrayList<ArrayList<Flight>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < numOfCities; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        for (int[] flight : flights) {
            int fromCity = flight[0];
            int toCity = flight[1];
            int price = flight[2];
            adjacencyList.get(fromCity).add(new Flight(toCity, price));
        }

        Queue<Tuple> queue = new LinkedList<>();
        queue.add(new Tuple(0, source, 0));

        int[] costs = new int[numOfCities];
        for (int i = 0; i < numOfCities; i++) {
            costs[i] = Integer.MAX_VALUE;
        }
        costs[source] = 0;

        while (!queue.isEmpty()) {
            Tuple current = queue.poll();
            int stops = current.stops;
            int city = current.city;
            int cost = current.cost;

            if (stops > maxStops) continue;

            for (Flight flight : adjacencyList.get(city)) {
                int adjacentCity = flight.toCity;
                int edgeWeight = flight.price;

                if (cost + edgeWeight < costs[adjacentCity] && stops <= maxStops) {
                    costs[adjacentCity] = cost + edgeWeight;
                    queue.add(new Tuple(stops + 1, adjacentCity, cost + edgeWeight));
                }
            }
        }

        System.out.println(costs[destination] == Integer.MAX_VALUE ? -1 : costs[destination]);
    }

    //Priority Queue HASHMAP , pq has logn add n remove.
    public static void spaceEfficientSolution(int n, int[][] flights,int src,int dst,int k){
        Map<Integer, Map<Integer, Integer>> prices = new HashMap<>();
        for (int[] f : flights) {
            if (!prices.containsKey(f[0])) prices.put(f[0], new HashMap<>());
            prices.get(f[0]).put(f[1], f[2]);
        }
        Queue<int[]> pq = new PriorityQueue<>((a, b) -> (Integer.compare(a[0], b[0])));
        pq.add(new int[] {0, src, k + 1});
        while (!pq.isEmpty()) {
            int[] top = pq.remove();
            int price = top[0];
            int city = top[1];
            int stops = top[2];
            if (city == dst) {System.out.println( price);
            return ;}
            if (stops > 0) {
                Map<Integer, Integer> adj = prices.getOrDefault(city, new HashMap<>());
                for (int a : adj.keySet()) {
                    pq.add(new int[] {price + adj.get(a), a, stops - 1});
                }
            }
        }
        System.out.println( -1);
    }
    public static void main(String[] args) {
        int[][] flight=new int[][]{{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int n=4;
        int src=0;
        int dst=3;
        int k=1;
        spaceEfficientSolution(n,flight,src,dst,k);
        (new CheapestFlightsWithinKStops()).timeEffecientSolution(n,flight,src,dst,k);

    }
}
