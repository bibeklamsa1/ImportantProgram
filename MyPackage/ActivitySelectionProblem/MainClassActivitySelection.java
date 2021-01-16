package MyPackage.ActivitySelectionProblem;

import java.util.ArrayList;
import java.util.List;

public class MainClassActivitySelection {
    public static void main(String[] args) {
        List<DataNode> dataNodeList = new ArrayList<>();

        dataNodeList.add(new DataNode(0,6));
        dataNodeList.add(new DataNode(3,4));
        dataNodeList.add(new DataNode(1,2));
        dataNodeList.add(new DataNode(5,8));
        dataNodeList.add(new DataNode(5,7));
        dataNodeList.add(new DataNode(8,9));
        //now implement that Algorithm
        ActivitySelectionProblemSolution solution = new ActivitySelectionProblemSolution(dataNodeList);
        solution.AlgoImplementation();
    }
}
