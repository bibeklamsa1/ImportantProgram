package MyPackage.DisjointSet;

import java.util.ArrayList;
import java.util.List;

public class DisjointMainFunction {
    public static void main(String[] args) {
        List<WeightedNode> nodeList = new ArrayList<>();
        for(int i=0;i<10;i++){
            WeightedNode weightedNode = new WeightedNode(""+(char)(i+65));
            nodeList.add(weightedNode);
        }

        DisjointSet disjointSet = new DisjointSet();
        disjointSet.driver(nodeList);
    }
}
