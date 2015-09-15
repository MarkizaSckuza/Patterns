package factory;

/**
 * Created by Margo on 15.09.2015.
 */
public class LamborghiniFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Lamborghini();
    }
}
