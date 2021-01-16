package MyPackage.DisjointSet;

import java.util.ArrayList;
import java.util.List;

public class DisjointSet {
    private List<WeightedNode> node= new ArrayList<>();

    public List<WeightedNode> getNode() {
        return node;
    }

    public void setNode(List<WeightedNode> node) {
        this.node = node;
    }

    public static  void driver(List<WeightedNode> nodeList){
        makeset(nodeList);//making the weightednode with the different function
        for(int i=0;i<nodeList.size()-1;i++){
            WeightedNode first= nodeList.get(i);
            WeightedNode second = nodeList.get(i+1);
            System.out.println("checking if firstname "+first.name+" second name "+second.name+" are different ?");
            System.out.println("first set name is "+first.getName());
            first.getDisjointSet().printAllPath();
            System.out.println("second set name is "+second.name);
            second.getDisjointSet().printAllPath();
            if(!findSet(first).equals(findSet(second))){
                System.out.println("Making union of "+first.name+" "+second.name);
                DisjointSet unionSet = new DisjointSet();
                unionSet.union(first,second);
                unionSet.printAllPath();
            }
        }


    }

    public static DisjointSet union(WeightedNode first,WeightedNode second){
        //three condition if both are equal then return
        DisjointSet disjointSetfirst = first.getDisjointSet();
        DisjointSet disjointSetsecond = second.getDisjointSet();
        if(disjointSetfirst.equals(disjointSetsecond)){
            return null;
        }
        else {
            if (disjointSetfirst.getNode().size() > disjointSetsecond.getNode().size()) {
                List<WeightedNode> nodelist2 = disjointSetsecond.getNode();
                for (WeightedNode n : nodelist2) {
                    n.setDisjointSet(disjointSetfirst);
                    disjointSetfirst.getNode().add(n);
                }
                return disjointSetfirst;
            } else {
                List<WeightedNode> nodeset2 = disjointSetsecond.getNode();
                for (WeightedNode n : nodeset2) {
                    n.setDisjointSet(disjointSetsecond);
                    disjointSetsecond.getNode().add(n);
                }
                return disjointSetsecond;
            }
        }
    }

    private static DisjointSet findSet(WeightedNode weightedNode){
        return weightedNode.getDisjointSet();
    }

    private static  DisjointSet getSet(WeightedNode weightedNode){
        return  weightedNode.getDisjointSet();
    }

    private void printAllPath() {
        System.out.println("Printing all the set ");
        for(WeightedNode weightedNode :node){
            System.out.print(weightedNode+"  ");
        }
        System.out.println();
    }


    private static void makeset(List<WeightedNode> nodeList) {
        for(WeightedNode weightedNode:nodeList){

            DisjointSet set = new DisjointSet();
            set.node.add(weightedNode);
            weightedNode.setDisjointSet(set);
        }

    }
}
