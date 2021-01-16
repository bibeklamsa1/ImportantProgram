package DJ;

import org.w3c.dom.xpath.XPathResult;

import java.util.*;

public class DJAlgo {
    List<WeightedNode> nodeList = new ArrayList<>();

    public DJAlgo(List<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

   public void FloydsWarshellAlgo(){
        int size = nodeList.size();
        int[][] graph = new int[size][size];
        for(int i=0;i<size;i++){
            WeightedNode weightedNodei = nodeList.get(i);
            for(int j=0;j<size;j++) {
                WeightedNode weightedNodej = nodeList.get(j);
                if (i == j) {
                    graph[i][j] = 0;
                }
                else if(weightedNodei.neighbours.contains(weightedNodej)){
                    graph[i][j] = weightedNodei.weightedNodeIntegerHashMap.get(weightedNodej);
                }
                else {
                    graph[i][j] = Integer.MAX_VALUE/10;
                }
            }
        }



        for(int k=0;k<size;k++){
            WeightedNode weightedNodek = nodeList.get(k);
            for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    if(i!=j){
                        if(graph[i][j]>graph[i][k]+graph[k][j]){
                            graph[i][j] = graph[i][k]+graph[k][j];
                            nodeList.get(j).setParent(weightedNodek);
                        }
                    }
                }
            }
        }

       for(int i=0;i<size;i++){
           for(int j=0;j<size;j++){
               System.out.print(graph[i][j]+" ");
           }
           System.out.println();
       }
   }
    private void pathPrint(WeightedNode weightedNode) {
        if(weightedNode.getParent()!=null){
            pathPrint(weightedNode.getParent());
            System.out.print(" --> "+weightedNode.name);
        }else{
            System.out.print(weightedNode.name);
        }
    }


    public void addDirectedEdge(int v1, int v2, int distance) {
        WeightedNode first = this.nodeList.get(v1-1);
        WeightedNode second = this.nodeList.get(v2-1);
        first.weightedNodeIntegerHashMap.put(second,distance);
        first.neighbours.add(second);
    }

    @Override
    public String toString() {
        return "DJAlgo{" +
                "nodeList=" + nodeList +
                '}';
    }



}
