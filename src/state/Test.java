package state;

/**
 * Created by Margo on 21.09.2015.
 */
public class Test {

    public static void main(String[] args) {

        TV tv = new TV(new OffState());
        tv.acton();

        tv.setState(new OnState());
        tv.acton();
    }
}
