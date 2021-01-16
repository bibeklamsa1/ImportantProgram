package StructuralDesignPattern.AdapterDesignPattern;

public class PenAdapter implements Pen{
    PilotPen p = new PilotPen();
    @Override
    public void write(String str) {
        p.write(str);
    }
}
