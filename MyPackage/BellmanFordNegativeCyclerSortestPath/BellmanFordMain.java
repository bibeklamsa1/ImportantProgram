package MyPackage.BellmanFordNegativeCyclerSortestPath;

import java.util.ArrayList;
import java.util.List;

public class BellmanFordMain {
    public static void main(String[] args) {
        List<WeightedNode> nodeList = new ArrayList<>();

        for(int i=0;i<5;i++){
            WeightedNode weightedNode = new WeightedNode(""+(char)(i+65));
            nodeList.add(weightedNode);
        }

       BellManFordImplementation bellManFordImplementation = new BellManFordImplementation(nodeList);
        bellManFordImplementation.addEdgeBetweenNode(1,3,6);
        bellManFordImplementation.addEdgeBetweenNode(1,4,-98);
        bellManFordImplementation.addEdgeBetweenNode(2,1,3);
        bellManFordImplementation.addEdgeBetweenNode(3,4,2);
        bellManFordImplementation.addEdgeBetweenNode(4,3,1);
        bellManFordImplementation.addEdgeBetweenNode(4,2,1);
        bellManFordImplementation.addEdgeBetweenNode(5,2,4);
        bellManFordImplementation.addEdgeBetweenNode(5,4,2);

        System.out.println(bellManFordImplementation.implementBellmanFord(nodeList.get(nodeList.size()-1)));
    }

}
