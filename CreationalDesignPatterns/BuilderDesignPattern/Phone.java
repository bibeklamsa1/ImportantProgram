package CreationalDesignPatterns.BuilderDesignPattern;

public class Phone {
    private String phname;
    private int ramsize;
    private int batteryPower;
    private  int price;
    public Phone(String phname, int ramsize, int batteryPower, int price) {
        this.phname = phname;
        this.ramsize = ramsize;
        this.batteryPower = batteryPower;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phname='" + phname + '\'' +
                ", ramsize=" + ramsize +
                ", batteryPower=" + batteryPower +
                ", price=" + price +
                '}';
    }
}
