package MyPackage.AllPairShortestPathProblem;


import java.util.List;

public class FloydWarshalls {
    List<WeightedNode> nodeList ;
    int[][] adjacencyMatrix;
    int size;

    public FloydWarshalls(List<WeightedNode> nodeList){
        this.nodeList = nodeList;
         size = nodeList.size();
        adjacencyMatrix = new int[size][size];
    }



    public void addEdgeBetwnVtxs(int v1,int v2,int distance){
        WeightedNode first = nodeList.get(v1-1);
        WeightedNode second = nodeList.get(v2-1);
        first.getNeigbours().add(second);
        first.getWeightedNodeIntegerHashMap().put(second,distance);
    }


    public void floydWarshallAlgorithm(){

        //now copy the adjaceyMatrix from the nodelist
        for(int i=0;i<size;i++){

            WeightedNode current = this.nodeList.get(i);
            for(int j=0;j<size;j++){
                WeightedNode second = this.nodeList.get(j);
                if(i==j){
                    adjacencyMatrix[i][j] = 0;
                }
                else if(current.getWeightedNodeIntegerHashMap().containsKey(second)){
                    adjacencyMatrix[i][j] = current.getWeightedNodeIntegerHashMap().get(second);
                }else{
                    adjacencyMatrix[i][j] = Integer.MAX_VALUE/10;
                }

            }
        }
        //now floyd's warshell's algorithm
        for(int eachNode =0;eachNode<size;eachNode++){
            for(int i=0;i<size;i++){
                for(int  j=0;j<size;j++){
                    if(adjacencyMatrix[i][j]>adjacencyMatrix[i][eachNode]+adjacencyMatrix[eachNode][j]){
                        adjacencyMatrix[i][j] = adjacencyMatrix[i][eachNode]+adjacencyMatrix[eachNode][j];
                    }
                }
            }
        }

        //printing all the path
        for(int i=0;i<size;i++){
            System.out.println("printing the path "+nodeList.get(i)+" is -> ");
            for(int j=0;j<size;j++){
                System.out.print(adjacencyMatrix[i][j]+"  ");
            }
            System.out.println();
        }

    }

}