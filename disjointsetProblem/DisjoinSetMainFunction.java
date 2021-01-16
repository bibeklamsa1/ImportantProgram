package disjointsetProblem;

import java.util.ArrayList;
import java.util.List;

public class DisjoinSetMainFunction {
    public static void main(String[] args) {
        List<WeightedNode> nodeList = new ArrayList<>();
        for(int i=0;i<10;i++){
            WeightedNode node =new WeightedNode(""+(char)(i+65));
            nodeList.add(node);
        }
        DisjointSet disjointSet = new DisjointSet();
        disjointSet.makeSet(nodeList);
        System.out.println(disjointSet.UnionFinder(nodeList.get(0),nodeList.get(1)));
        System.out.println(disjointSet.UnionFinder(nodeList.get(1),nodeList.get(0)));

    }
}
