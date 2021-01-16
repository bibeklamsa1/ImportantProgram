package KruskalsAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class KrushalsAlgorithm {
    //this is the weighted node list from main function we are passing
    List<WeightedNode> nodeList;
    //we are using disjoint set so the object of disjoint set is required
    DisjointSet disjointSet;
    //another thing need is UndirectedEdgeList
    List<UndirectedEdge> undirectedEdges = new ArrayList<>();

    public KrushalsAlgorithm(List<WeightedNode> nodeList,DisjointSet disjointSet) {
        this.nodeList = nodeList;
        this.disjointSet =disjointSet;
    }

    public void KruskalsAlgoImplementation(){
        //make the disjoint set each of the element
        disjointSet.makeSet(nodeList);
        int cost = 0;

        //based on the distance sort
        Comparator<UndirectedEdge> comparator = new Comparator<UndirectedEdge>() {
            @Override
            public int compare(UndirectedEdge o1, UndirectedEdge o2) {
                return o1.distance-o2.distance;
            }
        };
        Collections.sort(undirectedEdges,comparator);
        //this is for the min cost first and later max
        for(UndirectedEdge undirectedEdge:undirectedEdges){
            //if two sets are not in same set then Union them
            if(disjointSet.UnionFinder(undirectedEdge.vertex1,undirectedEdge.vertex2)){
                cost+=undirectedEdge.distance;
                System.out.println(undirectedEdge);
            }
        }
        System.out.println("Min cost "+cost);


    }

   //this is the undiredEdge
    public void UndirectedEdgeBetweenNode(int v1,int v2,int distance){
        UndirectedEdge undirectedEdge = new UndirectedEdge(nodeList.get(v1-1),nodeList.get(v2-1),distance);
        //first vertex
        WeightedNode getFirst = undirectedEdge.getVertex1();
        //second vertex
        WeightedNode getSecond = undirectedEdge.getVertex2();
        //first vertext->second vertex,distance
        undirectedEdge.weightedNodeIntegerHashMap.put(getFirst,distance);
        //second vertex->first vertex,distance
        undirectedEdge.weightedNodeIntegerHashMap.put(getSecond,distance);
        undirectedEdges.add(undirectedEdge);
    }


}
