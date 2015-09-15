package decorator;

/**
 * Created by Margo on 15.09.2015.
 */
public class Test {

    public static void main(String[] args) {

        Bottle milkBottle = new MilkBottle();
        System.out.println(milkBottle.getDescription());

        Bottle transparentBottle = new TransparentBottleDecorator(milkBottle);
        System.out.println("\n" + transparentBottle.getDescription());

        Bottle sizedBottle = new BottleSizeDecorator(transparentBottle, 1.50);
        System.out.println("\n" + sizedBottle.getDescription());

    }
}
