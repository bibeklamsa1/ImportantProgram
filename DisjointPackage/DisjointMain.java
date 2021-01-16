package DisjointPackage;

import java.util.ArrayList;
import java.util.List;

public class DisjointMain {
    public static void main(String[] args){
        List<WeightedNode> nodeList = new ArrayList<>();
        for(int i=0;i<5;i++){
            WeightedNode weightedNode = new WeightedNode(""+(char)(i+65));
            nodeList.add(weightedNode);
        }

        DisjointSet disjointSet = new DisjointSet();
        disjointSet.makeSet(nodeList);
        disjointSet.addEdgeBetweenUndiredGraph(1,2,10);
        disjointSet.addEdgeBetweenUndiredGraph(1,3,5);
        disjointSet.addEdgeBetweenUndiredGraph(3,4,8);
        disjointSet.addEdgeBetweenUndiredGraph(2,4,5);
        disjointSet.addEdgeBetweenUndiredGraph(3,5,6);
        disjointSet.addEdgeBetweenUndiredGraph(4,5,12);
        disjointSet.UnionFinder();
    }
}
