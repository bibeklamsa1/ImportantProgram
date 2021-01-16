package PrimsAlgorithm;

import java.util.*;

public class PrimsAlgorithm {
    List<WeightedNode> nodeList;
    List<UndirectedEdge> undirectedEdgeList = new ArrayList<>();
    public PrimsAlgorithm(List<WeightedNode> nodeList){
        this.nodeList = nodeList;
    }

    public void PrimsAlgoImplement(WeightedNode weightedNode){

        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        weightedNode.distance = 0;
        queue.add(weightedNode);
        queue.addAll(nodeList);
        while(!queue.isEmpty()){

            WeightedNode wtnode = queue.poll();



            //add all the connected node and update the node with the value

            for(WeightedNode neighbour:wtnode.getNighbours()){

                if(!neighbour.isvisited){
                    if(neighbour.distance> weightedNode.distance+wtnode.nextNodeDistanceMap.get(neighbour)){
                        neighbour.distance = wtnode.nextNodeDistanceMap.get(neighbour);
                        neighbour.setParent(wtnode);

                    }
                   queue.add(neighbour);
                }
            }
            wtnode.setIsvisited(true);
        }

        printPath();


    }

    private void printPath() {
        for(WeightedNode node:nodeList){
            System.out.println("node vlaue => "+node.distance+" name => "+node.getName());
        }
    }


    @Override
    public String toString() {
        return "PrimsAlgorithm{" +
                "undirectedEdgeList=" + undirectedEdgeList +
                '}';
    }

    public void UndirectedEdge(int v1, int v2, int distance){
        WeightedNode firstvtx = nodeList.get(v1-1);
        WeightedNode secondvtx = nodeList.get(v2-1);
        UndirectedEdge undirectedEdge = new UndirectedEdge(firstvtx,secondvtx,distance);
        undirectedEdge.vertex1.nextNodeDistanceMap.put(secondvtx,distance);
        undirectedEdge.vertex2.nextNodeDistanceMap.put(firstvtx,distance);
        undirectedEdge.vertex1.getNighbours().add(undirectedEdge.vertex2);
        undirectedEdge.vertex2.getNighbours().add(undirectedEdge.vertex1);
        undirectedEdgeList.add(undirectedEdge);

    }


}
