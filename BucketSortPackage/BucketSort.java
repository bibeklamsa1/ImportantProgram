package BucketSortPackage;

import java.util.ArrayList;
import java.util.List;

public class BucketSort {
    public static void main(String[] args) {
        //in bucket sort we have two forumula that we are using
        //first is the no of bucket = sq.root of no_of_element present in the given bucket
        int array[] = {10,30,20,50,60,40,80,90};
        int length = array.length;
        int bucketNo = (int)Math.sqrt(array.length);
        List<Bucket> bucketList = new ArrayList<>();
        for(int i=0;i<bucketNo;i++){
            Bucket bucket = new Bucket(""+(char)(i+65));
            bucketList.add(bucket);
        }
        BucketSortALgorithm bck = new BucketSortALgorithm(bucketList);
        bck.applyAlgorithm(array,length);

    }

}
