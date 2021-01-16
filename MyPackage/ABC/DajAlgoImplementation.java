package MyPackage.ABC;

import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class DajAlgoImplementation {
    List<WeightedNode> nodelist ;
    WeightedNode startNode;
    public DajAlgoImplementation(List<WeightedNode> nodelist){
        this.nodelist = nodelist;
    }

    public void EdgeBetweenTwoNodes(int v1,int v2,int distance){
        WeightedNode first = nodelist.get(v1-1);//becase index starts from 0 so we have to do this
        WeightedNode second = nodelist.get(v2-1);
        //add edge to the first one
        first.getNeighboursNodes().add(second);
        //add the distance and next node
        first.weight_NextNodeMap.put(second,distance);

    }

    public void djAlgoImp(WeightedNode start){
        PriorityQueue<WeightedNode> priorityQueue = new PriorityQueue<>();
        start.distance = 0;
        startNode = start;
        priorityQueue.add(start);
        priorityQueue.addAll(nodelist);
        while(!priorityQueue.isEmpty()){
            WeightedNode currentNode = priorityQueue.poll();
            currentNode.isvisited = true;
            for(WeightedNode neighbour:currentNode.getNeighboursNodes()) {
                if (priorityQueue.contains(neighbour)) {
                    if (priorityQueue.contains(neighbour)) {
                        if(neighbour.distance>currentNode.distance+currentNode.getWeight_NextNodeMap().get(neighbour)){
                            //we have to update the value of the dijstacka's node
                            neighbour.distance = currentNode.distance + currentNode.getWeight_NextNodeMap().get(neighbour);
                            neighbour.setParent(currentNode);
                        }
                    }
                }
            }
        }
        //here we have to implement the track of the road that is min distance
        for(WeightedNode node: nodelist){
            System.out.println("From "+node.name+" to "+start.name+" is far => "+node.distance+" away");
            printPath(node);
            System.out.println();
        }


    }

    private void printPath(WeightedNode node) {
        if(node.getParent()!=null){
            printPath(node.getParent());

            System.out.print(" -> "+node.name);
        }
        else{
            System.out.print(node.name);
        }
    }


}
