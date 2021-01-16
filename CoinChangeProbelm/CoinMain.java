package CoinChangeProbelm;

public class CoinMain {
    public static void main(String[] args) {
        int[] array = {1,2,5,10,20,50,100,500,1000};
        CoinProbelm coin = new CoinProbelm(array);
        coin.countCoin(553);
    }

}
