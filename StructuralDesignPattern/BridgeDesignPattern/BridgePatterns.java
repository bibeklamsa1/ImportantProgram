package StructuralDesignPattern.BridgeDesignPattern;

public class BridgePatterns {
    public static void main(String[] args) {
        Shape sh  = new Circle(100,200,500,new GreenCircle());
        sh.draw();
    }
}
