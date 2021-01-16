package BucketSortPackage;

import java.util.ArrayList;
import java.util.List;

public class Bucket {
    String name;
    List<Integer> bucklist = new ArrayList<>();
    public Bucket(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "name='" + name + '\'' +
                ", bucklist=" + bucklist +
                '}';
    }

    public List<Integer> getBucklist() {
        return bucklist;
    }

    public void setBucklist(List<Integer> bucklist) {
        this.bucklist = bucklist;
    }
}
