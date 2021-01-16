package CoinChangeProbelm;

public class CoinProbelm {
    int[] array ;
    public CoinProbelm(int[] array) {
        this.array = array;
    }

    public void countCoin(int rup){
        while (rup>0){
            for(int i=array.length-1;i>=0;i--){
                if(array[i]<=rup){
                    rup = rup - array[i];
                    System.out.println("ruppies is "+array[i]);
                    break;
                }
            }
        }

    }
}
