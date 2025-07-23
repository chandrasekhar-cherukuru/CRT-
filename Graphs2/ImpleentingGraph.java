package Graphs2;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
public class ImpleentingGraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        int V = sc.nextInt();
        System.out.println("Enter the number of edges: ");
        int E = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < V; i++){
            list.add(new ArrayList<>());
        }

        System.out.println("Enter edes line by line");
        for(int i = 0; i < E; i++){

            int u = sc.nextInt();
            int v = sc.nextInt();

            list.get(u).add(v);
            list.get(v).add(u);

        }

        //now the edges are connected 
        boolean[] visited = new boolean[V];
        BFS(list, visited, 0);
        visited = new boolean[V];
        DFS(list, visited, 0);


    }

    static void BFS(List<List<Integer>> list, boolean[] visited, int start){

        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;
        while(!q.isEmpty()){

            int current = q.poll();
            System.out.print(current+ " -> ");
            for(int neighbour : list.get(current)){

                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    q.offer(neighbour);
                }

            }
        }
    }

    static void DFS(List<List<Integer>> list, boolean[] visited, int start){

        visited[start] = true;
        System.out.print(start+ " -> ");
        for(int neighbour : list.get(start)){

            if(!visited[neighbour]){
                DFS(list, visited, neighbour);
            }
        }
    }
}
