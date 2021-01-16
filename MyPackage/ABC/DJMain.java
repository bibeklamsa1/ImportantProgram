package MyPackage.ABC;

import java.util.ArrayList;
import java.util.List;

public class DJMain {
    public static void main(String[] args) {
        List<WeightedNode> nodelist = new ArrayList<>();

        for(int i=0;i<5;i++){
            WeightedNode weightedNode = new WeightedNode(""+(char)(i+65));
            nodelist.add(weightedNode);
        }

        DajAlgoImplementation dj = new DajAlgoImplementation(nodelist);
        dj.EdgeBetweenTwoNodes(1,3,6);//A->c dist = 6
        dj.EdgeBetweenTwoNodes(1,4,3);//A->d dist = 3
        dj.EdgeBetweenTwoNodes(2,1,3);//B->A dist  = 3
        dj.EdgeBetweenTwoNodes(3,4,2);
        dj.EdgeBetweenTwoNodes(4,2,1);
        dj.EdgeBetweenTwoNodes(4,3,1);
        dj.EdgeBetweenTwoNodes(5,2,4);
        dj.EdgeBetweenTwoNodes(5,4,2);

        dj.djAlgoImp(dj.nodelist.get(4));



    }
}
