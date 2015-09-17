package templateMethod;

/**
 * Created by Margo on 17.09.2015.
 */
public class RibbedBottleForCondencedMilk extends BottleForCondensedMilk {


    @Override
    public void makeShape() {
        System.out.println("Making a ribbed shape");
    }
}
