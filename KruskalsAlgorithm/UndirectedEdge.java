package KruskalsAlgorithm;

import java.util.HashMap;

public class UndirectedEdge {
    WeightedNode vertex1;
    WeightedNode vertex2;
    int distance;
    //this is for undriected nodes and vertex we can use both vertext A->B-distance and B->A distnace
    HashMap<WeightedNode,Integer> weightedNodeIntegerHashMap=new HashMap<>();

    public UndirectedEdge(WeightedNode vertex1, WeightedNode vertex2, int distance) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.distance = distance;
    }

    public WeightedNode getVertex1() {
        return vertex1;
    }

    public void setVertex1(WeightedNode vertex1) {
        this.vertex1 = vertex1;
    }

    public WeightedNode getVertex2() {
        return vertex2;
    }

    public void setVertex2(WeightedNode vertex2) {
        this.vertex2 = vertex2;
    }

    @Override
    public String toString() {
        return "UndirectedEdge{" +
                "vertex1=" + vertex1.name +
                ", vertex2=" + vertex2.name +
                ", distance=" + distance +
                '}';
    }
}
