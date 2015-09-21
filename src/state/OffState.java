package state;

/**
 * Created by Margo on 21.09.2015.
 */
public class OffState implements State {


    @Override
    public void action() {
        System.out.println("TV is turned OFF");
    }
}
