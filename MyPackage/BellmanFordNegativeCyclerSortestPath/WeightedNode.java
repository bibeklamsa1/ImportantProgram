package MyPackage.BellmanFordNegativeCyclerSortestPath;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WeightedNode implements Comparable<WeightedNode>{
    //node has it's name,parent,visited or not,it's neighbour and negibour with edge A->[c,dist=3]
    WeightedNode parent;
    String name;
    int distance;
    boolean isvisited = false;
    List<WeightedNode> nigbourNode;
    HashMap<WeightedNode,Integer> nextWeightNode_dist;
    public WeightedNode(String name){
        this.name = name;
        nigbourNode = new ArrayList<>();
        nextWeightNode_dist = new HashMap<>();
        distance = Integer.MAX_VALUE/10;
    }

    public WeightedNode getParent() {
        return parent;
    }

    public void setParent(WeightedNode parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<WeightedNode> getNigbourNode() {
        return nigbourNode;
    }

    public void setNigbourNode(List<WeightedNode> nigbourNode) {
        this.nigbourNode = nigbourNode;
    }

    public HashMap<WeightedNode, Integer> getNextWeightNode_dist() {
        return nextWeightNode_dist;
    }

    public void setNextWeightNode_dist(HashMap<WeightedNode, Integer> nextWeightNode_dist) {
        this.nextWeightNode_dist = nextWeightNode_dist;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(WeightedNode o) {
        return this.distance-o.distance;
    }
}
