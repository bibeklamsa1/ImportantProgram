import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

public class TopologicalSort {
    public static void main(String[] args) {
        TopoSort tp  = new TopoSort();
        tp.createVertex(0);
        tp.createVertex(1);
        tp.createVertex(2);
        tp.createVertex(3);
        tp.createVertex(4);
        tp.createVertex(5);

        tp.insertEdgeFromTo(5,2);
        tp.insertEdgeFromTo(4,0);
        tp.insertEdgeFromTo(4,1);
        tp.insertEdgeFromTo(3,1);
        tp.insertEdgeFromTo(5,0);
        tp.insertEdgeFromTo(2,3);

        tp.display();
        tp.tpo_sort_implement();
    }
}
class TopoSort{
    HashMap<Integer, ArrayList<Integer>> arrayListHashMap;
    public TopoSort(){
        arrayListHashMap = new HashMap<>();
    }
    public void createVertex(int v){
        arrayListHashMap.put(v,new ArrayList<>());
    }
    public void insertEdgeFromTo(int v1,int v2){
        arrayListHashMap.get(v1).add(v2);
    }

    public void display(){
        System.out.println(arrayListHashMap.entrySet());
    }

    public void tpo_sort_implement(){
        int size = arrayListHashMap.size();
        boolean isvisited[] = new boolean[size];
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<size;i++){
            isvisited[i]  = false;
        }

        for(int i=0;i<size;i++){
            if(isvisited[i]==false){
                toposortUtil(i,isvisited,stk);
            }
        }
        while (!stk.isEmpty()){
            System.out.print(stk.pop()+" ");
        }
    }

    private void toposortUtil(int index, boolean[] isvisited, Stack<Integer> stk) {
        isvisited[index] = true;
        Integer i;
        Iterator<Integer> it = arrayListHashMap.get(index).iterator();
        while (it.hasNext()){
            i = it.next();
            if(!isvisited[i]){
                toposortUtil(i,isvisited,stk);
            }
        }
        stk.push(new Integer(index));
        System.out.println(stk.toString());
    }

}
