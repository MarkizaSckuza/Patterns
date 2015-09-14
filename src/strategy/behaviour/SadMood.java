package strategy.behaviour;

/**
 * Created by Margo on 14.09.2015.
 */
public class SadMood implements MoodBehaviour {

    @Override
    public void mood() {
        System.out.println("Nobody loves me:(");
    }
}
