import java.util.Arrays;
import java.util.HashMap;

public class Sort {
    public static void main(String[] args) {
        int array[] = {1,2,3,52,100,500,654,1000,1500};
//        HeapSort hp = new HeapSort(array.length);
//        System.out.println("before sorting "+ Arrays.toString(array));
//        hp.sort(array);
//        System.out.println("After sorting "+Arrays.toString(array));
//        BinarySearch bs = new BinarySearch();
//        System.out.println("pos is => "+bs.getBinarySearch(array,0,array.length,1500));
        Fibonacci fibonacci = new Fibonacci();
        System.out.println("fib of 60th number is => "+fibonacci.getfibonacci(60));

    }

}
class HeapSort{
    //in heap root->i left->i*2+1 right->i*2+2 ->and root->left/2 and root->right/2 of floor vlaue

    int[] heap;
    int n;
    int pos;
    public HeapSort(int length){

        this.n = length;
        this.heap = new int[length];
        pos = 0;
    }

    public void insertion(int item){
        heap[pos++] = item;
        heapify();
    }

    private void heapify() {
        for(int i=pos-1;i>=0;i--){
         int root_pos = i/2;
         if(root_pos>=0 && heap[root_pos]>heap[i]){
             int temp = heap[root_pos];
             heap[root_pos] = heap[i];
             heap[i] = temp;
         }
        }
    }

    private  int delete() {

        if (pos == 2) {
            if (heap[0] > heap[1]) {
                int temp = heap[0];
                heap[0] = heap[1];
                heap[1] = temp;
            }
        }
        int deleted = heap[0];
        heap[0] = heap[--pos];
        heap[pos] = 0;
        afterDeletedHeapify();
        return deleted;
    }






    private void afterDeletedHeapify() {
        //root to last
        int root_index = 0;
        int left_index = root_index*2+1;
        int right_index = root_index*2+2;
        for(int i=0;(left_index<pos && right_index<pos);i++){
            if(heap[left_index]<=heap[right_index]){
                if(heap[root_index]>heap[left_index]) {
                    int temp = heap[root_index];
                    heap[root_index] = heap[left_index];
                    heap[left_index] = temp;
                }
            }else {
                if (heap[root_index] > heap[right_index]) {
                    int temp = heap[root_index];
                    heap[root_index]=heap[right_index];
                    heap[right_index] = temp;
                }
            }
            root_index++;
            left_index = root_index*2+1;
            right_index = root_index*2+2;
        }
    }

    public void sort(int[] array){
        for(int i:array){
            insertion(i);
        }
       for(int i=0;i<n;i++){
           array[i] = delete();
       }

    }
}

class Fibonacci{
    HashMap<Integer,Integer> hm = new HashMap<>();
    public int getfibonacci(int n){

        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        if(hm.containsKey(n)){
            return  hm.get(n);
        }
        else{
            int value= getfibonacci(n-1)+getfibonacci(n-2);
            hm.put(n,value);
            System.out.println("value is => "+value);
            return value;

        }
    }
}


class BinarySearch{
    public int getBinarySearch(int[] array,int start,int end,int search){
        if(start<=end){
            int mid = (start+end)/2;
            if(array[mid]==search){
                return  mid;
            }
            else if(array[mid]<search){
                return getBinarySearch(array,mid+1,end,search);
            }else{
                return  getBinarySearch(array,start,mid-1,search);
            }
        }
        return -1;
    }
}