import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class NumberFactor {
//    public static void main(String[] args) {
//        NumberFactor nf = new NumberFactor();
//        System.out.println("waystogetNum is => "+nf.waysToGet(5));
//    }
//    public int waysToGet(int n){
//        if(n==0 || n==1 || n==2){
//            return   1;
//        }
//        if(n==3){
//            return 2;
//        }
//
//        int subtract1 = waysToGet(n-1);
//        int subtract3 = waysToGet(n-3);
//        int subtract4 = waysToGet(n-4);
//        return subtract1+subtract4+subtract3;
//    }

    public static void main(String[] args) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        System.out.println("\nwe get num is "+getFib(5,hm));

    }

    public static int getFibBottomUp(int n){
        int temp[] = new int[n];
        temp[0]=0;
        temp[1] = 1;
        int sum = 0;
        if(n==0){
            return  0;
        }
        if(n==1 || n==2){
            return 1;
        }

        for(int i=1;i<n;i++){
            sum = temp[i]+temp[i-1];
            temp[i-1] = temp[i];
            temp[i] = sum;
        }
        System.out.println("Array is "+ Arrays.toString(temp));
        return temp[n-1];

    }




    //this is the top to down approach first go to top to down and solve recursively all and stored and come to top recursively
    public static int getFib(int n,HashMap<Integer,Integer> hm){
        if(n==0 || n==1 || n ==2){
            return 1;
        }
        if(hm.containsKey(n)){
            return hm.get(n);
        }
        else{

            int fib = getFib(n-1,hm)+getFib(n-2,hm);
            System.out.print(fib+" ");
            hm.put(n,fib);
            return fib;
        }
    }


}
