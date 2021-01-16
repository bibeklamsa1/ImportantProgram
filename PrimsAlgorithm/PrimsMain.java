package PrimsAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class PrimsMain {
    public static void main(String[] args) {
        List<WeightedNode> nodeList = new ArrayList<>();

        for(int i=0;i<5;i++){
            WeightedNode weightedNode = new WeightedNode(""+(char)(i+65));
            nodeList.add(weightedNode);
        }


        PrimsAlgorithm primsAlgorithm = new PrimsAlgorithm(nodeList);
        primsAlgorithm.UndirectedEdge(1,2,10);
        primsAlgorithm.UndirectedEdge(2,3,5);
        primsAlgorithm.UndirectedEdge(3,4,8);
        primsAlgorithm.UndirectedEdge(5,1,20);
        primsAlgorithm.UndirectedEdge(4,5,6);


        primsAlgorithm.PrimsAlgoImplement(nodeList.get(0));


    }
}
