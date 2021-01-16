package MyPackageShortestPathFIndinder;

import java.util.ArrayList;

public class DijkstraMainFunction {
    public static void main(String[] args) {

        ArrayList<WeightedNode> nodelist = new ArrayList<>();

        for(int i=0;i<5;i++){
            WeightedNode weightedNode = new WeightedNode(""+(char)(i+65));
            nodelist.add(weightedNode);
        }

        DijkstraAlogrithm dj = new DijkstraAlogrithm(nodelist);


        dj.addEdgeBetweenVertex(1,3,6);//A->c dist 6

        dj.addEdgeBetweenVertex(1,4,3);//A->D dist 3

        dj.addEdgeBetweenVertex(2,1,3);

        dj.addEdgeBetweenVertex(3,4,2);
        dj.addEdgeBetweenVertex(4,3,1);
        dj.addEdgeBetweenVertex(4,2,1);

        dj.addEdgeBetweenVertex(5,2,4);
        dj.addEdgeBetweenVertex(5,4,2);
        dj.djImplementation(nodelist.get(4));

    }
}
