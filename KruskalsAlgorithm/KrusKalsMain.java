package KruskalsAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class KrusKalsMain {
    public static void main(String[] args) {
        //this is the weighted node
        List<WeightedNode> weightedNodes = new ArrayList<>();
        for(int i=0;i<5;i++){
            WeightedNode weightedNode = new WeightedNode(""+(char)(i+65));
            weightedNodes.add(weightedNode);
        }

        //now make the Object of kruskalsMain algorithm
        DisjointSet disjointSet = new DisjointSet();
        KrushalsAlgorithm krushalsAlgorithm = new KrushalsAlgorithm(weightedNodes,disjointSet);


        //Adding the undirected edge
        krushalsAlgorithm.UndirectedEdgeBetweenNode(1,2,8);//A->B,8
        krushalsAlgorithm.UndirectedEdgeBetweenNode(1,3,5);//A->c,5
        krushalsAlgorithm.UndirectedEdgeBetweenNode(3,4,4);
        krushalsAlgorithm.UndirectedEdgeBetweenNode(2,4,6);
        krushalsAlgorithm.UndirectedEdgeBetweenNode(3,5,80);
        krushalsAlgorithm.UndirectedEdgeBetweenNode(4,5,12);
        //this is to implement the kruskals algorithm
        krushalsAlgorithm.KruskalsAlgoImplementation();


    }
}
