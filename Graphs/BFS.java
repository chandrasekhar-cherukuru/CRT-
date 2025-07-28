package Graphs;


// 📌 1. Using ArrayList<ArrayList<Integer>>
// 🔹 Best when:
// Your nodes are labeled with consecutive integers from 0 to n-1.
// You know the number of vertices in advance.
// You want fast access by index.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class BFS {

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

        addEdge(0, 2);
        addEdge(0, 1);
        addEdge(1, 3);
        addEdge(2, 3);

        System.out.println("BFS from source(0): ");
        bfsGraph(2);
        
    }

    //it uses queue
    static void bfsGraph(int start){

        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.offer(start);

        while(!q.isEmpty()){
            int curr = q.poll();
            System.out.print(curr+ "  ");
            for(int neighbour : adj.get(curr)){

                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    q.offer(neighbour);
                }
            }
        }
    }
}
