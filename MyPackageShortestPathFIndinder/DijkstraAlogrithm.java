package MyPackageShortestPathFIndinder;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraAlogrithm {
    ArrayList<WeightedNode> nodelist;

    public DijkstraAlogrithm(ArrayList<WeightedNode> nodelist){
        this.nodelist = nodelist;
    }

    public void addEdgeBetweenVertex(int v1,int v2,int distance){
        WeightedNode first = nodelist.get(v1-1);
        WeightedNode second = nodelist.get(v2-1);
        first.getNeighbours().add(second);
        first.getWeightMap().put(second,distance);
    }


    public void djImplementation(WeightedNode node){
        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        node.distance = 0;
        queue.addAll(nodelist);
        while (!queue.isEmpty()){
            WeightedNode temp = queue.poll();
            for(WeightedNode nighbours:temp.getNeighbours()){
                if(queue.contains(nighbours)){
                    if(nighbours.distance>(temp.distance+temp.getWeightMap().get(nighbours))){
                        nighbours.distance = temp.distance+temp.getWeightMap().get(nighbours);
                        nighbours.parent = temp;
                        queue.remove(nighbours);
                        queue.add(nighbours);
                    }
                }
            }
        }
        for(WeightedNode nodeToCheck: nodelist) {
            System.out.print("Node "+nodeToCheck.name+", distance: "+nodeToCheck.distance+", Path: ");
            pathPrint(nodeToCheck);
            System.out.println();
        }
    }

    private void pathPrint(WeightedNode node) {

            if(node.getParent()!=null) {
                pathPrint(node.getParent());
                System.out.print("->"+node.name);
            }
            else
                System.out.print(node.name);


    }


}
