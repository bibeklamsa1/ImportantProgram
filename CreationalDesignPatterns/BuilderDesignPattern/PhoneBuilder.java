package CreationalDesignPatterns.BuilderDesignPattern;

public class PhoneBuilder {
    private String phname;
    private int ramsize;
    private int batteryPower;
    private  int price;

    public PhoneBuilder setPhname(String phname) {
        this.phname = phname;
        return  this;
    }

    public PhoneBuilder setRamsize(int ramsize) {
        this.ramsize = ramsize;
        return this;
    }

    public PhoneBuilder setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
        return this;
    }

    public PhoneBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public Phone getPhone(){
        return new Phone(this.phname,this.ramsize,this.batteryPower,this.price);
    }
}
