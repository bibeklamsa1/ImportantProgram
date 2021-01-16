package MyPackage.AllPairShortestPathProblem;


import java.util.ArrayList;
import java.util.List;

public class FloydMainFunction {
    public static void main(String[] args) {

        List<WeightedNode> nodeList = new ArrayList<>();
        for(int i=0;i<4;i++){
            WeightedNode weightedNode = new WeightedNode(""+(char)(i+65));
            nodeList.add(weightedNode);
        }

        FloydWarshalls floydWarshalls = new FloydWarshalls(nodeList);

        floydWarshalls.addEdgeBetwnVtxs(1, 2, 1);// Add A-> D , weight 1
        floydWarshalls.addEdgeBetwnVtxs(1, 2, -8);// Add A-> B , weight 8
        floydWarshalls.addEdgeBetwnVtxs(2, 3, 1);// Add B-> C , weight 1
        floydWarshalls.addEdgeBetwnVtxs(3, 1, 4);// Add C-> A , weight 4
        floydWarshalls.addEdgeBetwnVtxs(4, 2, 2);// Add D-> B , weight 2
        floydWarshalls.addEdgeBetwnVtxs(4, 3, 9);// Add D-> C , weight 9
        floydWarshalls.floydWarshallAlgorithm();

    }
}
