package Knapsackproblem;

public class ObjectIs implements Comparable<ObjectIs>{
    double weight;
    double value;
    double fract;

    public ObjectIs(double weight, double value, double fract) {
        this.weight = weight;
        this.value = value;
        this.fract = fract;
    }

    @Override
    public String toString() {
        return "ObjectIs{" +
                "weight=" + weight +
                ", value=" + value +
                ", fract=" + fract +
                '}';
    }

    @Override
    public int compareTo(ObjectIs o) {
        double d = o.fract-this.fract;
        if(d>0){
            return 1;
        }else if(d==0.0){
            return 0;
        }else{
            return -1;
        }
    }
}
