package KruskalsAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class DisjointSet {
    List<WeightedNode> nodes = new ArrayList<>();

    public List<WeightedNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<WeightedNode> nodes) {
        this.nodes = nodes;
    }

    public DisjointSet getDisjointSet(WeightedNode weightedNode){
        return weightedNode.getDisjointSet();
    }
    public DisjointSet findSet(WeightedNode weightedNode){
        return weightedNode.getDisjointSet();
    }

    public void makeSet(List<WeightedNode> nodes){
        //making for each set
        for(WeightedNode weightedNode:nodes){
            DisjointSet set = new DisjointSet();
            set.getNodes().add(weightedNode);
            weightedNode.setDisjointSet(set);
        }
    }

    public void print(Object obj){
        System.out.println(""+obj);
    }

    public boolean UnionFinder(WeightedNode weightedNode1,WeightedNode weightedNode2){
        if(findSet(weightedNode1).equals(findSet(weightedNode2))){
            print("Not able to union because ofthe  cycle is formed");
            return false;
        }
        else{
            boolean isPossibleUnion = Union(weightedNode1,weightedNode2);
            return isPossibleUnion;
        }

    }

    private boolean Union(WeightedNode weightedNode1, WeightedNode weightedNode2) {
        if(findSet(weightedNode1).equals(findSet(weightedNode2))){
            print("Not able to union because ofthe  cycle is formed");
            return false;
        }
        else{
            //here two condition
            //set1 is greater in size is condition 1
            //set2 is greater in size is condition 2
            //condition first
            DisjointSet set1 = weightedNode1.getDisjointSet();
            DisjointSet set2 = weightedNode2.getDisjointSet();
            if(set1.getNodes().size()>=set2.getNodes().size()){
                //now copy all the element node as the set1 node
                List<WeightedNode> weightedNodes  = set2.getNodes();
                for(WeightedNode weightedNode:weightedNodes){
                    //first make all the weighted node of set2 to set1
                    weightedNode.setDisjointSet(set1);
                    //finally merge them
                    set1.getNodes().add(weightedNode);
                }

                return  true;
            }
            else{
                List<WeightedNode> weightedNodes  = set1.getNodes();
                for(WeightedNode weightedNode:weightedNodes){
                    //first make all the weighted node of set2 to set1
                    weightedNode.setDisjointSet(set2);
                    //finally merge them
                    set2.getNodes().add(weightedNode);
                }

                return  true;
            }
        }
    }


}
