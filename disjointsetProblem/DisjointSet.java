package disjointsetProblem;

import MyPackageShortestPathFIndinder.DijkstraAlogrithm;

import java.util.ArrayList;
import java.util.List;

public class DisjointSet {
    List<WeightedNode> nodes = new ArrayList<>();
    public void setNodes(List<WeightedNode> nodes){
        this.nodes = nodes;
    }
    public List<WeightedNode> getNodes(){
        return  this.nodes;
    }


    @Override
    public String toString() {
        return "DisjointSet{" +
                "disjointSetList=" + nodes +
                '}';
    }

    public void makeSet(List<WeightedNode> nodeList){
        for(WeightedNode weightedNode:nodeList){
            DisjointSet disjointSet = new DisjointSet();
            disjointSet.nodes.add(weightedNode);
            weightedNode.setDisjointSet(disjointSet);//taking the reference to the WeightedNode
        }

    }


    public DisjointSet getSet(WeightedNode node){
        return  node.getDisjointSet();
    }
    public DisjointSet findSet(WeightedNode node){
        return node.getDisjointSet();
    }

    public DisjointSet UnionFinder(WeightedNode weightedNode1, WeightedNode weightedNode2) {

        if(findSet(weightedNode1).equals(findSet(weightedNode2))){
            System.out.println("First set is => "+weightedNode1.getDisjointSet());
            System.out.println("Second set is =>"+weightedNode1.getDisjointSet());
            System.out.println("Not able to uninon beacuse cycle is  formed");
            return null;
        }
        else{
            DisjointSet set = Union(weightedNode1,weightedNode2);
            return set;
        }

    }

    private DisjointSet Union(WeightedNode weightedNode1, WeightedNode weightedNode2) {
        if(findSet(weightedNode1).equals(weightedNode2)){

            return null;
        }else{

            //case are 2
            //case 1:weightNode1 of disjoint set size is greater
            //case2 :weightedNode2 of disjoint set size is greater
            DisjointSet set1 = weightedNode1.getDisjointSet();
            DisjointSet set2 = weightedNode2.getDisjointSet();
            if(set1.getNodes().size()>=set2.getNodes().size()){
                //this is case1
                //here the set2 element are copied to set 1 and merge can be done
                List<WeightedNode> nodes = set2.getNodes();
                for(WeightedNode weightedNode:nodes) {
                    weightedNode.setDisjointSet(set1);
                    set1.getNodes().add(weightedNode);
                }
                return  set1;

            }
            else{
                //this is case 2
                //here the set1 element are copied to set 2 and merge can be done
                List<WeightedNode> nodes = set1.getNodes();
                for(WeightedNode weightedNode:nodes){
                    weightedNode.setDisjointSet(set2);
                    set2.getNodes().add(weightedNode);
                }
            }
            return set2;

        }



    }
}