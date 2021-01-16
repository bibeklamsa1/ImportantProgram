package DJ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WeightedNode implements Comparable<WeightedNode> {
    String name;
    WeightedNode parent;
    boolean isvisited;
    List<WeightedNode> neighbours = new ArrayList<>();
    HashMap<WeightedNode,Integer> weightedNodeIntegerHashMap = new HashMap<>();
    int distance;

    public WeightedNode(String name) {
        this.name = name;
        distance = Integer.MAX_VALUE/10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsvisited() {
        return isvisited;
    }

    public void setIsvisited(boolean isvisited) {
        this.isvisited = isvisited;
    }

    public WeightedNode getParent() {
        return parent;
    }

    public void setParent(WeightedNode parent) {
        this.parent = parent;
    }

    public List<WeightedNode> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<WeightedNode> neighbours) {
        this.neighbours = neighbours;
    }

    public HashMap<WeightedNode, Integer> getWeightedNodeIntegerHashMap() {
        return weightedNodeIntegerHashMap;
    }

    public void setWeightedNodeIntegerHashMap(HashMap<WeightedNode, Integer> weightedNodeIntegerHashMap) {
        this.weightedNodeIntegerHashMap = weightedNodeIntegerHashMap;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "WeightedNode{" +
                "name='" + name + '\'' +
                ", neighbours=" + neighbours +
                ", distance=" + distance +
                '}';
    }

    @Override
    public int compareTo(WeightedNode o) {
        return this.distance - o.distance;
    }
}
