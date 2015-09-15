package decorator;

/**
 * Created by Margo on 15.09.2015.
 */
public class BottleSizeDecorator extends BottleDecorator {

    private Bottle bottle;
    private double size;

    public BottleSizeDecorator(Bottle bottle, double size) {
        this.bottle = bottle;
        this.size = size;
    }

    @Override
    public String getDescription() {
        return bottle.getDescription() + ", size: " + size + " liters";
    }
}
