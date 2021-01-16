package StructuralDesignPattern.BridgeDesignPattern;

public class RedCircile implements DrawAPI {
    @Override
    public void draw(int radius ,int x, int y) {
        System.out.println("Red circle radius is = "+radius+" and height is "+x+" width is "+y);
    }
}
