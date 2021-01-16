package CreationalDesignPatterns.FactoryPatternDesign.WindowsOperationgSystem;

import CreationalDesignPatterns.FactoryPatternDesign.Interface.OperatingSystem;

public class WindowsOperationgSystem implements OperatingSystem {
    @Override
    public void showDescription() {
        System.out.println("Havily used in desktop is Windows operating system");
    }
}
