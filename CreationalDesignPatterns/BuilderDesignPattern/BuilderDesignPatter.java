package CreationalDesignPatterns.BuilderDesignPattern;

public class BuilderDesignPatter{
    public static void main(String[] args) {
        Phone ph = new PhoneBuilder().setBatteryPower(3100).getPhone();
        System.out.println(ph);
    }
}
