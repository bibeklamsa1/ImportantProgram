package MyPackage.BellmanFordNegativeCyclerSortestPath;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class BellManFordImplementation {
    List<WeightedNode> nodeList;
    public BellManFordImplementation(List<WeightedNode> nodeList){
        this.nodeList = nodeList;
    }

    public void addEdgeBetweenNode(int v1,int v2,int distance){
        WeightedNode firstweightedNode = nodeList.get(v1-1);
        WeightedNode secondweightedNode = nodeList.get(v2-1);
        firstweightedNode.nigbourNode.add(secondweightedNode);
        firstweightedNode.nextWeightNode_dist.put(secondweightedNode,distance);
    }

    public String implementBellmanFord(WeightedNode start){
        start.distance = 0;
        //this is for the v-1 time to check
        for(int i=0;i<nodeList.size()-1;i++) {
            Queue<WeightedNode> q = new LinkedList<>();
            q.add(start);

            q.addAll(nodeList);
            while (!q.isEmpty()) {
                WeightedNode currentNode = q.poll();

                for (WeightedNode neighbour : currentNode.getNigbourNode()) {
                        int cost =currentNode.distance + currentNode.getNextWeightNode_dist().get(neighbour);
                        if (neighbour.distance > cost) {
                            neighbour.distance = currentNode.distance + currentNode.getNextWeightNode_dist().get(neighbour);
                            neighbour.setParent(currentNode);
                        }

                    }
                }

            }
        //checking the negative cycle
        Queue<WeightedNode> q = new LinkedList<>();
        q.add(start);
        q.addAll(nodeList);
        while (!q.isEmpty()) {
            WeightedNode currentNode = q.poll();
            for (WeightedNode neighbour : currentNode.getNigbourNode()) {
                int cost =currentNode.distance + currentNode.getNextWeightNode_dist().get(neighbour);
                if (neighbour.distance > cost) {
                    return "Negative Cycle is here so do not able to find path";

                }

            }
        }



        for(WeightedNode nodeTrack:nodeList){
                System.out.println("Node " + nodeTrack.name + " to " + nodeTrack.parent + " distance is " + nodeTrack.distance);
        }
        return "No negative cycle";
    }

    private void pathPrint(WeightedNode nodeTrack) {
        if(nodeTrack.getParent()!=null){
            pathPrint(nodeTrack.getParent());
            System.out.print(" -> "+nodeTrack.name);
        }else{
            System.out.print(nodeTrack.name);
        }
    }


}
