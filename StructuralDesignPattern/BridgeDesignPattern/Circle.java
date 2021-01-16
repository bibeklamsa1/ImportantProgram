package StructuralDesignPattern.BridgeDesignPattern;

public class Circle extends Shape{
    int x, y,radius;

    public Circle(int x,int y,int radius,DrawAPI drawAPI){

        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.draw(x,y,radius);
    }
}
