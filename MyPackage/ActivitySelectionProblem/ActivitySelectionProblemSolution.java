package MyPackage.ActivitySelectionProblem;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ActivitySelectionProblemSolution {
    List<DataNode> dataNodeList;


    public ActivitySelectionProblemSolution(List<DataNode> dataNodeList){
        this.dataNodeList = dataNodeList;
    }
    public void AlgoImplementation(){
        //sort the activity first
        Comparator<DataNode> basedon = new Comparator<DataNode>() {
            @Override
            public int compare(DataNode o1, DataNode o2) {
                return o1.end-o2.end;
            }
        };
        Collections.sort(dataNodeList,basedon);
        System.out.println(dataNodeList);
        //now first complete the small task based on it's finished time
        int finished =Integer.MIN_VALUE;
        int count = 0;
        //based on start is depending on finishing the previous activities
        for(DataNode node:dataNodeList){
            if(node.start>=finished){
                System.out.println("this is possible "+node);
                finished = node.end;
                count++;
            }
        }

    }
}
