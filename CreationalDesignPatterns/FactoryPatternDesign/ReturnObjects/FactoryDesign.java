package CreationalDesignPatterns.FactoryPatternDesign.ReturnObjects;

import CreationalDesignPatterns.FactoryPatternDesign.Interface.OperatingSystem;
import CreationalDesignPatterns.FactoryPatternDesign.MobileOperatingSystem.MobileOS;
import CreationalDesignPatterns.FactoryPatternDesign.WindowsOperationgSystem.WindowsOperationgSystem;

public class FactoryDesign {
    public OperatingSystem getObject(String s){
        if(s.equalsIgnoreCase("mobile")) {
            return new MobileOS();
        }
       else{
            return  new WindowsOperationgSystem();
        }
    }
}
