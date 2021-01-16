package disjointsetProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WeightedNode implements Comparable<WeightedNode>{
    String name;
    WeightedNode parent;
    boolean isvisited;
    int distance;
    DisjointSet disjointSet;
    HashMap<WeightedNode,Integer> nextnodeWithDistance = new HashMap<>();
    List<WeightedNode> neighbours = new ArrayList<>();

    public WeightedNode(String name){
        this.name= name;
        this.distance = Integer.MAX_VALUE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DisjointSet getDisjointSet() {
        return disjointSet;
    }

    public void setDisjointSet(DisjointSet disjointSet) {
        this.disjointSet = disjointSet;
    }

    public WeightedNode getParent() {
        return parent;
    }

    public void setParent(WeightedNode parent) {
        this.parent = parent;
    }

    public boolean isIsvisited() {
        return isvisited;
    }

    public void setIsvisited(boolean isvisited) {
        this.isvisited = isvisited;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public HashMap<WeightedNode, Integer> getNextnodeWithDistance() {
        return nextnodeWithDistance;
    }

    public void setNextnodeWithDistance(HashMap<WeightedNode, Integer> nextnodeWithDistance) {
        this.nextnodeWithDistance = nextnodeWithDistance;
    }

    public List<WeightedNode> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<WeightedNode> neighbours) {
        this.neighbours = neighbours;
    }

    @Override
    public String toString() {
        return "WeightedNode{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(WeightedNode o) {
        return 0;
    }
}
