package decorator;

/**
 * Created by Margo on 15.09.2015.
 */
public class TransparentBottleDecorator extends BottleDecorator {

    Bottle bottle;

    public TransparentBottleDecorator(Bottle bottle) {
        this.bottle = bottle;
    }

    @Override
    public String getDescription() {
        return bottle.getDescription() + ", bottle type: transparent";
    }

}
