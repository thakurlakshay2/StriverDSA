package Recursion;

public class RatInAMaze {

    public void rat(int[][] maze){
        recursion(maze,"",new boolean[maze.length][maze[0].length],0,0);
    }
    private void recursion(int[][] maze , String path,boolean[][] visited, int i, int j){
        if(i==maze.length-1 && j==maze[0].length-1){
            System.out.println(path);
            return ;
        }
        if(i<0 || i>=maze.length || j<0 || j>=maze.length){
            return ;
        }
        if(visited[i][j] || maze[i][j]==0){
            return ;
        }


            maze[i][j]=0;
            recursion(maze,path+"U",visited,i-1,j);
            maze[i][j]=1;



            maze[i][j]=0;
            recursion(maze,path+"L",visited,i,j-1);
            maze[i][j]=1;


            maze[i][j]=0;
            recursion(maze,path+"D",visited,i+1,j);
            maze[i][j]=1;


            maze[i][j]=0;
            recursion(maze,path+"R",visited,i,j+1);
            maze[i][j]=1;

        return ;

    }
}
