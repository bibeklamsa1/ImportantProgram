package PrimsAlgorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WeightedNode implements Comparable<WeightedNode>{
    boolean isvisited = false;
    String name;
    WeightedNode parent;
    int distance;
    HashMap<WeightedNode,Integer> nextNodeDistanceMap = new HashMap<>();
    List<WeightedNode> nighbours = new ArrayList<>();

    public WeightedNode(String name){
        this.name = name;
        this.distance = Integer.MAX_VALUE/10;
    }

    public boolean isIsvisited() {
        return isvisited;
    }

    public void setIsvisited(boolean isvisited) {
        this.isvisited = isvisited;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WeightedNode getParent() {
        return parent;
    }

    public void setParent(WeightedNode parent) {
        this.parent = parent;
    }

    public HashMap<WeightedNode, Integer> getNextNodeDistanceMap() {
        return nextNodeDistanceMap;
    }

    public void setNextNodeDistanceMap(HashMap<WeightedNode, Integer> nextNodeDistanceMap) {
        this.nextNodeDistanceMap = nextNodeDistanceMap;
    }

    public List<WeightedNode> getNighbours() {
        return nighbours;
    }

    public void setNighbours(List<WeightedNode> nighbours) {
        this.nighbours = nighbours;
    }

    @Override
    public String toString() {
        return "WeightedNode{" +
                "isvisited=" + isvisited +
                ", name='" + name + '\'' +
                ", distance=" + distance +
                '}';
    }

    @Override
    public int compareTo(WeightedNode o) {
        return this.distance - o.distance;
    }
}
