package strategy.behaviour;

/**
 * Created by Margo on 14.09.2015.
 */
public class GoodMood implements MoodBehaviour {

    @Override
    public void mood() {
        System.out.println("What a wonderful world!");
    }
}
