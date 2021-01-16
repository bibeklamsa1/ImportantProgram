import java.util.Stack;

public class HistProblem {

}



class solve{

    // Function to calculate max rectangular area histogram
    // hist[]: input array
    // n: size of array
    public static long getMaxArea(long hist[], long n)  {
        // your code here
        Stack<Long> stk = new Stack<>();
        long max_area = 0;
        long  i= 0;
        while(i<n){
            if(stk.isEmpty() || hist[Math.toIntExact(stk.peek())]<=hist[(int)i]){
                stk.push(i++);
            }
            else{
                long polled_index = stk.peek();
                stk.pop();
                long area = hist[(int)polled_index] * (stk.isEmpty()?i:i-stk.peek()-1);
                if(area>max_area){
                    max_area =area;
                }
            }
        }
        while(!stk.isEmpty()){
            long polled_index = stk.peek();
            stk.pop();
            long area = hist[(int)polled_index] * (stk.isEmpty()?i:i-stk.peek()-1);
            if(area>max_area){
                max_area =area;
            }

        }
        return max_area;
    }

}




