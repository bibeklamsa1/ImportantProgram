package CreationalDesignPatterns.FactoryPatternDesign.MobileOperatingSystem;

import CreationalDesignPatterns.FactoryPatternDesign.Interface.OperatingSystem;

public class MobileOS implements OperatingSystem {
    @Override
    public void showDescription() {
        System.out.println("Most powerfull opertaing system");
    }
}
