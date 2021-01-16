import java.util.*;

class solution_{
    //here i want a node
    HashMap<Integer,Integer> hamp = new HashMap<>();
    HashMap<Integer, ArrayList<Integer>> hm;
    public solution_(){
        hm = new HashMap<>();
    }
    public void createANode(int vertex){
        hm.put(vertex,new ArrayList<>());
    }
    public void insertAEdgeFromTo(int vertex1,int vertex2){
        hm.get(vertex2).add(vertex1);
        hm.get(vertex1).add(vertex2);
    }
    public void display(){
        System.out.println(hm.entrySet());
    }

    public void topoSort(){
        int length = hm.size();
        Stack<Integer> stk = new Stack<>();
        boolean isvisited[] = new boolean[length];
        for(int i=0;i<length;i++){
            isvisited[i] = false;
        }
        //now call the unvisited vertex
        for(int i=0;i<length;i++){
            if(!isvisited[i]){
                toposortUtil(i,isvisited,stk);
            }
        }
        while (!stk.isEmpty()){
            System.out.print(stk.pop()+" ");
        }

    }

    public void bfsSort(int v1){
        boolean isvisited[] = new boolean[hm.size()];
        Arrays.fill(isvisited,false);
        Queue<Integer> q= new LinkedList<>();
        q.add(v1);
        while(!q.isEmpty()){
            int temp = q.poll();
            if(!isvisited[temp]){
                hamp.put(temp,-1);
                isvisited[temp] =true;
                for(int i:hm.get(temp)){
                    if(!isvisited[i]){
                        hamp.put(i,temp);
                        q.add(i);
                        System.out.println("this is called "+i+" -> "+temp);

                    }
                }
            }
        }
        System.out.println(hamp.entrySet());
    }




    public void toposortUtil(int index,boolean[] isvisited,Stack<Integer> stk){
        isvisited[index] = true;

        for(int i:hm.get(index)){
            if(!isvisited[i]){
                toposortUtil(i,isvisited,stk);
            }
        }
        stk.push(index);
    }


}

public class MySolution {
    public static void main(String[] args) {
        solution_ s = new solution_();
        s.createANode(0);
        s.createANode(1);
        s.createANode(2);
        s.createANode(3);
        s.createANode(4);
        s.insertAEdgeFromTo(0,1);
        s.insertAEdgeFromTo(0,2);
        s.insertAEdgeFromTo(1,2);
        s.insertAEdgeFromTo(2,4);
        s.createANode(5);
        s.insertAEdgeFromTo(5,2);
        s.insertAEdgeFromTo(4,3);
        s.display();
        s.bfsSort(0);
    }
}
