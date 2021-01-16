package DisjointPackage;

public class UndirectedEdge implements Comparable<UndirectedEdge>{
   WeightedNode vertex1;
   WeightedNode vertex2;
    int distance;

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

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "UndirectedEdge{" +
                "vertex1=" + vertex1 +
                ", vertex2=" + vertex2 +
                ", distance=" + distance +
                '}';
    }

    @Override
    public int compareTo(UndirectedEdge o) {
        return this.distance - o.distance;
    }
}
