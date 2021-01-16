package Knapsackproblem;

import java.util.ArrayList;
import java.util.List;

public class MainFunction {
    public static void main(String[] args) {
        double weight[] = {6.0,10.0,3.0,5.0,1.0,3.0};
        double value[] =  {6.0,2.0,1.0,8.0,3.0,5.0};

        List<ObjectIs> objectIsList = new ArrayList<>();


        for(int i=0;i<weight.length;i++){
            ObjectIs obj = new ObjectIs(weight[i],value[i],value[i]/weight[i]);
            objectIsList.add(obj);
        }

        Knapsack knapsack= new Knapsack(objectIsList);
        knapsack.performKnapack(10);
    }

}
