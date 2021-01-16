import java.util.HashMap;

public class MyCompetative {
    public static void main(String[] args) {
        OneAway oneAway = new OneAway();
        System.out.println(oneAway.tsp(1,0));
    }
}

class OneAway{
    //what is the no of pepople that 50% of them have no same birthday date
    int dist[][];
    int ans = Integer.MAX_VALUE;
    int n =4 ;
    int visited_all = (1<<n)-1;
    public  OneAway(){
        dist=new int[][]{{0,20,42,25},{20,0,30,34},{42,30,0,10},{25,34,10,0}};
    }
    public int  tsp(int mask,int pos){
        if(mask == visited_all){
            return  dist[pos][0];
        }
        //try to visit all the other unvisited cities
        for(int city=0;city<n;city++){
            if((mask & (1<<city))==0){
                int newAns = dist[pos][city]+tsp(mask|(1<<city),city);
                System.out.println("new ANs "+newAns);
                ans = Math.min(ans,newAns);
            }
        }
        return ans;
    }
}
