package CreationalDesignPatterns.SingleTonPatternDesign;

public class Main {
    public static void main(String[] args) {
        SingleTonPattern s = SingleTonPattern.getInstance();
        s.message();
    }
}
