import java.util.Arrays;

public class MyClass {

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int array[] =  {2, 4, 1, 3, 5};
        System.out.println("before sort array is "+ Arrays.toString(array));
        ms.mergesort(array,0,array.length);
        System.out.println("After sort array is "+ Arrays.toString(array));
        System.out.println("count of inversion of array is "+MergeSort.count);

    }
}

class MergeSort{
    static int count = 0;
    public static void mergesort(int[] arr,int start,int end){
        if(end>start){
            int mid = (int)(start+end)/2;
            mergesort(arr,start,mid);
            mergesort(arr,mid+1,end);
            mergerSorter(arr,start,mid,end);
        }

    }

    private static void mergerSorter(int[] arr, int start, int mid, int end) {
        int left = start;
        int right = mid;
        int pos = 0;
        int length = end-start+1;

        int tempArray[] = new int[length];
        while (left<mid && right<end){

            if(arr[left]>arr[right]){
                tempArray[pos++] = arr[right++];
                count++;
            }else{

                tempArray[pos++] = arr[left++];
            }
        }
        while(left<mid){

            tempArray[pos++] = arr[left++];
        }
        while (right<end){
            tempArray[pos++]=arr[right++];

        }
        for(int i=0;i<pos;i++){
            arr[start+i] = tempArray[i];
        }


    }

}
