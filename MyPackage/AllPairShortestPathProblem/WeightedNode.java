package MyPackage.AllPairShortestPathProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WeightedNode implements  Comparable<WeightedNode>{

    String name;
    WeightedNode parent;
    int distance;
    List<WeightedNode> neigbours = new ArrayList<>();
    HashMap<WeightedNode,Integer> weightedNodeIntegerHashMap = new HashMap<>();
    boolean isvisited;
    public WeightedNode(String name){
        this.name = name;
        this.distance = Integer.MAX_VALUE;
    }

    public WeightedNode getParent() {
        return parent;
    }

    public void setParent(WeightedNode parent) {
        this.parent = parent;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public List<WeightedNode> getNeigbours() {
        return neigbours;
    }

    public void setNeigbours(List<WeightedNode> neigbours) {
        this.neigbours = neigbours;
    }

    public HashMap<WeightedNode, Integer> getWeightedNodeIntegerHashMap() {
        return weightedNodeIntegerHashMap;
    }

    public void setWeightedNodeIntegerHashMap(HashMap<WeightedNode, Integer> weightedNodeIntegerHashMap) {
        this.weightedNodeIntegerHashMap = weightedNodeIntegerHashMap;
    }

    public boolean isIsvisited() {
        return isvisited;
    }

    public void setIsvisited(boolean isvisited) {
        this.isvisited = isvisited;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(WeightedNode o) {
        return this.distance - o.distance;
    }
}
