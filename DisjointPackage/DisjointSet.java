package DisjointPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DisjointSet {
    List<WeightedNode> disjointSetNodes = new ArrayList<>();
    List<UndirectedEdge> undirectedEdges = new ArrayList<>();


    public List<WeightedNode> getDisjointSetNodes() {
        return disjointSetNodes;
    }

    public void setDisjointSetNodes(List<WeightedNode> disjointSetNodes) {
        this.disjointSetNodes = disjointSetNodes;
    }
    //this is for finding the node present set that is in which set the element is present
    public DisjointSet getSet(WeightedNode node){
        return  node.getDisjointSet();
    }
    public DisjointSet findSet(WeightedNode node){
        return  node.getDisjointSet();
    }


    //make set
    public void makeSet(List<WeightedNode> disjointSetNodes){
        this.disjointSetNodes = disjointSetNodes;
        for(WeightedNode node:disjointSetNodes){
            DisjointSet disjointSet = new DisjointSet();
            disjointSet.getDisjointSetNodes().add(node);
            node.setDisjointSet(disjointSet);
        }

    }

    public void UnionFinder(){
        Collections.sort(undirectedEdges);
        int cost = 0;
        for(UndirectedEdge undirectedEdge:undirectedEdges){
            WeightedNode v1 = undirectedEdge.getVertex1();
            WeightedNode v2 = undirectedEdge.getVertex2();
            if(Union(v1,v2)){
                cost+=undirectedEdge.distance;
                System.out.println(undirectedEdge);
            }

        }
        System.out.println("cost is => "+cost);
    }

    private boolean Union(WeightedNode weightedNode1, WeightedNode weightedNode2) {
        //for other function may use this so
        if(findSet(weightedNode1).equals(findSet(weightedNode2))){
            return false;
        }else{
            //now both are  from different set
            //two case 1:set1 is larged
            //case 2:set2 is larged
            DisjointSet set1 = weightedNode1.getDisjointSet();
            DisjointSet set2  =weightedNode2.getDisjointSet();

            if(set1.getDisjointSetNodes().size()>=set2.getDisjointSetNodes().size()){
                //now copy all the element to set1 and make set2 root as set1
                List<WeightedNode> weightedNodes = set2.getDisjointSetNodes();
                for(WeightedNode weightedNode:weightedNodes){
                    //now here is the work
                    weightedNode.setDisjointSet(set1);
                    set1.getDisjointSetNodes().add(weightedNode);
                }
                return true;
            }
            else{
                //now set2 is large at this case make all the set element of set2 as set1 disjointset
                //and finnally add it to the set1
                List<WeightedNode> weightedNodes = set1.getDisjointSetNodes();
                for(WeightedNode node:weightedNodes){
                    node.setDisjointSet(set2);
                    set2.getDisjointSetNodes().add(node);
                }
                return true;
            }
        }


    }

    public void addEdgeBetweenUndiredGraph(int firstIndex,int secondIndex,int weight){
        UndirectedEdge undirectedEdge = new UndirectedEdge(disjointSetNodes.get(firstIndex-1),disjointSetNodes.get(secondIndex-1),weight);
        WeightedNode first = undirectedEdge.getVertex1();
        WeightedNode second = undirectedEdge.getVertex2();
        first.getNeighbour().add(second);
        first.hashMapDistance.put(second,weight);
        second.getNeighbour().add(first);
        second.hashMapDistance.put(first,weight);
        undirectedEdges.add(undirectedEdge);


    }


}
