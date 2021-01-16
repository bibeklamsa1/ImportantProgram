package Knapsackproblem;

import java.util.Collections;
import java.util.List;

public class Knapsack {
    List<ObjectIs> objectIsList;
    public Knapsack(List<ObjectIs> objectIsList) {
        this.objectIsList = objectIsList;
    }

    public void performKnapack(int cap){
        Collections.sort(objectIsList);
        double capacity= cap;
        double profit = 0;
        for(ObjectIs obj : objectIsList){
            if(capacity>=obj.weight){
                profit+=obj.value;
                capacity = capacity - obj.weight;
            }
            else{
                profit+=capacity*obj.fract;
                capacity = capacity - (obj.fract)*capacity;
                break;
            }

        }
        System.out.println("profit is => "+profit+" and capcity is => "+capacity);

    }

}
