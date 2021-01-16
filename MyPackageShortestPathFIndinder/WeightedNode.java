package MyPackageShortestPathFIndinder;

import java.util.ArrayList;
import java.util.HashMap;

public class WeightedNode implements Comparable<WeightedNode>{
    String name;
    WeightedNode parent;
    HashMap<WeightedNode,Integer> weightMap = new HashMap<>();
    ArrayList<WeightedNode> neighbours = new ArrayList<>();
    int distance;
    boolean isvisited = false;

    public void setIsvisited(boolean isvisited){
        this.isvisited = isvisited;
    }

    public WeightedNode(String name) {
        this.name = name;
        this.distance = Integer.MAX_VALUE;
    }

    public WeightedNode getParent() {
        return parent;
    }

    public void setParent(WeightedNode parent) {
        this.parent = parent;
    }

    public HashMap<WeightedNode, Integer> getWeightMap() {
        return weightMap;
    }

    public void setWeightMap(HashMap<WeightedNode, Integer> weightMap) {
        this.weightMap = weightMap;
    }

    public ArrayList<WeightedNode> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(ArrayList<WeightedNode> neighbours) {
        this.neighbours = neighbours;
    }

    @Override
    public String toString() {
        return "WeightedNode{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                ", isvisited=" + isvisited +
                '}';
    }


    @Override
    public int compareTo(WeightedNode o) {
        return this.distance-o.distance;
    }
}
