package CreationalDesignPatterns.FactoryPatternDesign;

import CreationalDesignPatterns.FactoryPatternDesign.Interface.OperatingSystem;
import CreationalDesignPatterns.FactoryPatternDesign.ReturnObjects.FactoryDesign;

public class FactoryDesignMethod {
    public static void main(String[] args) {
        FactoryDesign factoryDesign = new FactoryDesign();
        OperatingSystem os = factoryDesign.getObject("wi");
        os.showDescription();

    }
}
