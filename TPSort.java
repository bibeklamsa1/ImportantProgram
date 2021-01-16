import java.util.ArrayList;
import java.util.HashMap;

import java.util.Stack;

public class TPSort {
    public static void main(String[] args) {
        TPSort tp = new TPSort();
        tp.createANode(0);
        tp.createANode(1);
        tp.createANode(2);
        tp.createANode(3);
        tp.createANode(4);
        tp.insertDirectedEdge(0,1);
        tp.insertDirectedEdge(0,2);
        tp.insertDirectedEdge(1,3);
        tp.insertDirectedEdge(2,3);
        tp.insertDirectedEdge(4,3);
        tp.display();
        tp.getTopoSort();

    }
    HashMap<Integer, ArrayList<Integer>> hm ;
    public TPSort(){
        hm =  new HashMap<>();
    }
    public void  createANode(int v){
        hm.put(v,new ArrayList<>());
    }

    public void insertDirectedEdge(int v1,int v2){
        hm.get(v2).add(v1);
    }
    public void display(){
        System.out.println(hm.entrySet());
    }

    public void getTopoSort(){
        int length = hm.size();
        Stack<Integer> stk = new Stack<>();
        boolean[] isvisited = new boolean[length];
        for(int i=0;i<length;i++){
            isvisited[i] = false;
        }
        //now visite the node
        for(int i=0;i<length;i++){
            if(!isvisited[i]){
                gettopoUtil(i,isvisited,stk);
            }
        }
        while (!stk.isEmpty()){
            System.out.print(stk.pop()+" ");
        }
    }

    private void gettopoUtil(int i, boolean[] isvisited, Stack<Integer> stk) {
        isvisited[i] = true;

        for(int index:hm.get(i))
        {
            if(!isvisited[index]){
                gettopoUtil(index,isvisited,stk);
            }
        }
        stk.push(i);

    }


}
