package DJ;

import java.util.ArrayList;
import java.util.List;

public class DjMain {
    public static void main(String[] args) {
        List<WeightedNode> nodeList = new ArrayList<>();
        for(int i=0;i<5;i++){
            WeightedNode weightedNode = new WeightedNode(""+(char)(i+65));
            nodeList.add(weightedNode);
        }


        DJAlgo djAlgo = new DJAlgo(nodeList);

        djAlgo.addDirectedEdge(1,2,3);//1->2,3
        djAlgo.addDirectedEdge(3,2,3);
        djAlgo.addDirectedEdge(5,4,9);
        djAlgo.addDirectedEdge(3,1,6);
        djAlgo.addDirectedEdge(4,2,8);
        djAlgo.addDirectedEdge(3,4,5);
        djAlgo.addDirectedEdge(4,3,5);
        djAlgo.addDirectedEdge(5,3,2);
        djAlgo.addDirectedEdge(2,3,5);
        djAlgo.addDirectedEdge(1,5,8);
        djAlgo.FloydsWarshellAlgo();
    }
}
