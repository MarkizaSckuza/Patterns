package composite;

/**
 * Created by Margo on 19.09.2015.
 */
public class Test {

    public static void main(String[] args) {

        Component leaf1 = new Leaf("Leaf1");
        Component leaf2 = new Leaf("Leaf2");
        Component leaf3 = new Leaf("Leaf3");

        Component composite1 = new Composite("Composite1");
        Component composite2 = new Composite("Composite2");

        composite1.addComponent(leaf1);
        composite1.addComponent(leaf2);

        composite2.addComponent(leaf3);

        leaf1.action2();
        leaf2.action3();

        composite1.action1();

        System.out.println(composite1.toString());
        System.out.println(composite2.toString());

    }
}
