package Graph;

import java.util.ArrayList;
import java.util.List;

public class GraphRepresentation {

    // Adjacency List Representation of Graph
    public void adjListRepresentation(int V, int[][] edges){
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<=V; i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            int u = edge[0], v = edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        for(List<Integer> adj: adjList){
            System.out.println(adj);
        }
    }
}
