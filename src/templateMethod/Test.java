package templateMethod;

/**
 * Created by Margo on 17.09.2015.
 */
public class Test {

    public static void main(String[] args) {

        SimpleBottleForCondencedMilk simpleBottle = new SimpleBottleForCondencedMilk();
        BottleForCondensedMilk ribbedBottle = new RibbedBottleForCondencedMilk();

        System.out.println("Making the ribbed bottle:");
        ribbedBottle.createBottle();
        System.out.println("");

        System.out.println("Making the simple bottle:");
        simpleBottle.createBottle();
    }
}
