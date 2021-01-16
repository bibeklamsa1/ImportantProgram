package BucketSortPackage;

import java.util.List;

public class BucketSortALgorithm {
    List<Bucket> bucketList;
    public BucketSortALgorithm(List<Bucket> bucketList){
        this.bucketList = bucketList;
    }

    public void applyAlgorithm(int[] array,int length){

        int max = getMax(array);
        //now here we have to apply the algorithm
        //here the bucket allocation of the object is => bucket_allocation = (item*no_bucket)/max_element
        for(int element:array){
           int bucket =((int)Math.ceil(element*bucketList.size()/max))%bucketList.size();
            System.out.println(bucket);
           bucketList.get(bucket).bucklist.add(element);
        }
        System.out.println(bucketList);

    }

    private int getMax(int[] array) {
        int m = 0;
        for(int a:array){
            if(a>m){
                m = a;
            }
        }
        return m;
    }


}
