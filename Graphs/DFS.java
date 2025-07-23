package Graphs;

import java.util.ArrayList;

public class DFS {
    static int V = 4;
    static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    public static void addEdge(int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void main(String[] args) {
        

        for(int i = 0; i < 4; i++){
            adj.add(new ArrayList());
        }

        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 3);
        addEdge(2, 3);

        System.out.println("BFS from source(0): ");
        boolean[] visited = new boolean[V];

        dfsGraph(0, visited);
        
    }

    //it uses stack
    static void dfsGraph(int start, boolean[] visited){

        visited[start] = true;

        System.out.print(start+ " ");
        for(int neighbour : adj.get(start)){

            if(!visited[neighbour]){
                visited[neighbour] = true;
                dfsGraph(neighbour, visited);
            }
        }
    }
}
