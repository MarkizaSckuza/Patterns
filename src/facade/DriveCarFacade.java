package facade;

/**
 * Created by Margo on 16.09.2015.
 */
public class DriveCarFacade {

    private Engine engine;
    private FuelSupplySystem fuelSupplySystem;

    public DriveCarFacade(Engine engine, FuelSupplySystem fuelSupplySystem) {
        this.engine = engine;
        this.fuelSupplySystem = fuelSupplySystem;
    }

    public void startTheCar() {
        System.out.println("Starting the car...");
        fuelSupplySystem.injectFuel();
        engine.startSpinCrankshaft();
    }

    public void stopTheCar() {
        System.out.println("Stopping the car...");
        fuelSupplySystem.stopInjectingFuel();
        engine.stopSpinCrankshaft();
    }

}
