package MyPackage.ABC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//this comparable interface helps to min hepify the algorithm
public class WeightedNode implements Comparable<WeightedNode>{
    // A node has name,distance,visitedornot,it's parent from where it will travel ,neighbour nodes like A-> B,C and weightedmap is A->B,4 like this.
    String name;
    int distance;
    boolean isvisited;
    WeightedNode Parent;
    List<WeightedNode> neighboursNodes = new ArrayList<>();
    HashMap<WeightedNode,Integer> weight_NextNodeMap= new HashMap<>();

    public WeightedNode(String name) {
        this.name = name;
        distance = Integer.MAX_VALUE;
        Parent = null;
    }

    public boolean isIsvisited() {
        return isvisited;
    }

    public void setIsvisited(boolean isvisited) {
        this.isvisited = isvisited;
    }

    public WeightedNode getParent() {
        return Parent;
    }

    public void setParent(WeightedNode parent) {
        Parent = parent;
    }

    public List<WeightedNode> getNeighboursNodes() {
        return neighboursNodes;
    }

    public void setNeighboursNodes(ArrayList<WeightedNode> neighboursNodes) {
        this.neighboursNodes = neighboursNodes;
    }

    public HashMap<WeightedNode, Integer> getWeight_NextNodeMap() {
        return weight_NextNodeMap;
    }

    public void setWeight_NextNodeMap(HashMap<WeightedNode, Integer> weight_NextNodeMap) {
        this.weight_NextNodeMap = weight_NextNodeMap;
    }

    @Override
    public String toString() {
        return "WeightedNode{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                '}';
    }

    @Override
    public int compareTo(WeightedNode o) {
        return this.distance - o.distance;
    }
}
