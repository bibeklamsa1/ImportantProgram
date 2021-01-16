package DisjointPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WeightedNode {
    DisjointSet disjointSet;
    String name;
    WeightedNode parent;
    List<WeightedNode> neighbour =new ArrayList<>();
    HashMap<WeightedNode,Integer> hashMapDistance=new HashMap<>();
    public WeightedNode(String name) {
        this.name = name;
    }

    public DisjointSet getDisjointSet() {
        return disjointSet;
    }

    public void setDisjointSet(DisjointSet disjointSet) {
        this.disjointSet = disjointSet;
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

    public HashMap<WeightedNode, Integer> getHashMapDistance() {
        return hashMapDistance;
    }

    public void setHashMapDistance(HashMap<WeightedNode, Integer> hashMapDistance) {
        this.hashMapDistance = hashMapDistance;
    }

    @Override
    public String toString() {
        return "WeightedNode{" +
                "name='" + name + '\'' +
                '}';
    }
}
