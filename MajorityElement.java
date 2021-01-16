public class MajorityElement {
    //finding the majority element in the giveen array
    public static void main(String[] args) {
        int array[] = {1,3,4,2,2};
        int major = getMajorityElementMooreLaw(array,array.length);
        System.out.println("Majority element is => "+major);
    }

    private static int getMajorityElementMooreLaw(int[] array, int length) {
        int count = 0;
        int majority = array[0];
        for(int i=1;i<length;i++){
            if(majority==array[i]){
                count++;
            }
            else{
                if(count>1){
                    count--;
                }else{
                    majority = array[i];
                    count = 1;
                }
            }
        }
        count = 0;
        for(int i:array){
            if (i==majority){
                count++;
            }
        }
        boolean flag = count>=(int)(length/2);
        if(flag){
            return majority;
        }
        else{
            return  -1;
        }
    }
}
