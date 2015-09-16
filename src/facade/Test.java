package facade;

/**
 * Created by Margo on 16.09.2015.
 */
public class Test {

    public static void main(String[] args) {

        DriveCarFacade facade = new DriveCarFacade(new Engine(), new FuelSupplySystem());
        facade.startTheCar();
        facade.stopTheCar();
    }
}
