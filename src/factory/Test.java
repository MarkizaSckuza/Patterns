package factory;

/**
 * Created by Margo on 15.09.2015.
 */
public class Test {

    public static void main(String[] args) {

        CarFactory mercedesFactory = new MercedesFactory();
        CarFactory lamborghiniFactory = new LamborghiniFactory();

        Car mercedes = mercedesFactory.createCar();
        mercedes.drive();

        Car lamborghini = lamborghiniFactory.createCar();
        lamborghini.drive();
    }
}
