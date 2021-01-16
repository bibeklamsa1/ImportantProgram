package MyPackage.DisjointSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WeightedNode {
    String name;
    WeightedNode parent;
    List<WeightedNode> neighbour = new ArrayList<>();
    DisjointSet disjointSet;
    boolean isvisited = false;
    HashMap<WeightedNode,Integer> distanceEdge = new HashMap<>();
    public WeightedNode(String name){
        this.name = name;
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

    public List<WeightedNode> getNeighbour() {
        return neighbour;
    }

    public void setNeighbour(List<WeightedNode> neighbour) {
        this.neighbour = neighbour;
    }

    public DisjointSet getDisjointSet() {
        return disjointSet;
    }

    public void setDisjointSet(DisjointSet disjointSet) {
        this.disjointSet = disjointSet;
    }

    public boolean isIsvisited() {
        return isvisited;
    }

    public void setIsvisited(boolean isvisited) {
        this.isvisited = isvisited;
    }

    public HashMap<WeightedNode, Integer> getDistanceEdge() {
        return distanceEdge;
    }

    public void setDistanceEdge(HashMap<WeightedNode, Integer> distanceEdge) {
        this.distanceEdge = distanceEdge;
    }

    @Override
    public String toString() {
        return name;
    }
}
