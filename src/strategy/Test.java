package strategy;

import strategy.behaviour.SadMood;

/**
 * Created by Margo on 15.09.2015.
 */
public class Test {

    public static void main(String[] args) {

        Human human = new Human();
        human.mood();

        human.setMoodBehaviour(new SadMood());
        human.mood();
    }
}
