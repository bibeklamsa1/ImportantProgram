package StructuralDesignPattern.AdapterDesignPattern;

public class AdapterDesign {
    public static void main(String[] args) {
        Pen p = new PenAdapter();
        Assignment assignment = new Assignment();
        assignment.setP(p);
        assignment.p.write("this is my pen");
    }
}
