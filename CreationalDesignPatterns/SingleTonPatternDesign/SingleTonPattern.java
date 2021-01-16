package CreationalDesignPatterns.SingleTonPatternDesign;

public class SingleTonPattern {
    private  static  SingleTonPattern  instagnce= new SingleTonPattern();
    private SingleTonPattern(){}
    public  static SingleTonPattern getInstance(){
        return instagnce;
    }
    public void message(){
        System.out.println("this is message");
    }

}
