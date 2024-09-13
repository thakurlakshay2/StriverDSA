package InterviewQuestions;

//Given N conversions between different units of measurements.(kg, g, m, mm, etc...)
// For Q queries -> convert X units of Y to Z or -1 if that conversion is not possible

//Input:

//N=3

//kg-g 1000
//foot-cm 30.48
//pound-g 453.6

//Q=2
//  2 kg-pound // convert 2 kg to pound
//  1 foot-kg
//Output:
//  4.4


import java.util.*;

public class Zeta {
    static class Conversion{
        String v,u;
        double value;

        public Conversion(String v, String u, double value) {
            this.v = v;
            this.u = u;
            this.value = value;
        }
    }

    static class Query{
        double amount;
        String from,to;

        public Query(double amount, String from, String to) {
            this.amount = amount;
            this.from = from;
            this.to = to;
        }
    }

    static class Pair{
        String unit;
        double value;

        public Pair(String unit, double value) {
            this.unit = unit;
            this.value = value;
        }
    }


    public static void  addConversion(Map<String, List<Pair>> graph, String u, String v, double value){
        graph.putIfAbsent(u,new ArrayList<>());
        graph.putIfAbsent(v,new ArrayList<>());

        graph.get(u).add(new Pair(v,value));
        graph.get(v).add(new Pair(u,1/value));

    }
    public static double bfs(Map<String, List<Pair>> graph, String start, String end) {
        if (!graph.containsKey(start) || !graph.containsKey(end)) {
            return -1.0;
        }

        Queue<Pair> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.add(new Pair(start, 1.0));

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            String currentUnit = current.unit;
            double currentValue = current.value;

            if (currentUnit.equals(end)) {
                return currentValue;
            }

            visited.add(currentUnit);

            for (Pair neighbor : graph.get(currentUnit)) {
                if (!visited.contains(neighbor.unit)) {
                    queue.add(new Pair(neighbor.unit, currentValue * neighbor.value));
                }
            }
        }

        return -1.0;
    }

    public static List<Double> convertUnits(List<Conversion> conversions, List<Query> queries){
        Map<String, List<Pair>> graph = new HashMap<>();

        // Build the graph from conversions
        for (Conversion conversion : conversions) {
            addConversion(graph, conversion.u, conversion.v, conversion.value);
        }

        // Process each query
        List<Double> results = new ArrayList<>();
        for (Query query : queries) {
            double conversionFactor = bfs(graph, query.from, query.to);
            if (conversionFactor == -1) {
                results.add(-1.0);
            } else {
                results.add(query.amount * conversionFactor);
            }
        }

        return results;

    }

    public static void main(String[] args) {
        List<Conversion> conversions = Arrays.asList(
                new Conversion("kg", "g", 1000),
                new Conversion("foot", "cm", 30.48),
                new Conversion("pound", "g", 453.6)
        );

        List<Query> queries = Arrays.asList(
                new Query(2, "kg", "pound"),    // 2 kg to pound
                new Query(1, "foot", "kg")      // 1 foot to kg (should return -1)
        );

        // Convert units based on queries
        List<Double> results = convertUnits(conversions, queries);

        // Output results
        for (double res : results) {
            System.out.println(res);
        }

    }

}
