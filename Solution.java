import java.sql.Array;
import java.sql.Struct;
import java.util.*;


class Graph{


    public void addEdge(int vertex1, int vertex2, ArrayList<ArrayList<Integer>> graph) {
        graph.get(vertex1).add(vertex2);
        graph.get(vertex2).add(vertex1);
    }

    public void dfsUtil(ArrayList<ArrayList<Integer>> graph, int pos, boolean[] vertexVisited) {
        vertexVisited[pos] = true;
        System.out.print(graph.get(pos)+"  ");
        for(int i:graph.get(pos)){
            if(!vertexVisited[i]){
                dfsUtil(graph,i,vertexVisited);

            }
        }
    }
}


public class Solution {
    public static void main(String[] args) {
        Graph g = new Graph();
        int vertex = 7;
        int edge = 8;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean vertexVisited[] = new boolean[vertex];
        for(int i=0;i<4;i++){
            //adding all the vertex in the list
            adj.add(i,new ArrayList<>());
        }
        System.out.println(adj.toString());
        g.addEdge(0, 1,adj);
        g.addEdge(0, 2,adj);
        g.addEdge(1, 3,adj);
        g.addEdge(4, 1,adj);
        g.addEdge(6, 4,adj);
        g.addEdge(5, 6,adj);
        g.addEdge(5, 2,adj);
        g.addEdge(6, 0,adj);
        System.out.println(adj.toString());
        g.dfsUtil(adj,0,vertexVisited);
    }



}