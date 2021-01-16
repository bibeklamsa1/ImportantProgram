package KruskalsAlgorithm;

public class WeightedNode {
    //a node having it's name
    String name;
    //it's disjoint set
    DisjointSet disjointSet;


    public WeightedNode(String name){
        this.name = name;
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
}
