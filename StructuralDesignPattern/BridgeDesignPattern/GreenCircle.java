package StructuralDesignPattern.BridgeDesignPattern;

public class GreenCircle implements DrawAPI{
    @Override
    public void draw(int radius,int x, int y) {
        System.out.println("Green circle  radius"+radius+" height is = "+x+" width is "+y);
    }
}
