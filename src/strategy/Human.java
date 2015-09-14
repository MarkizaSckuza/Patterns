package strategy;

import strategy.behaviour.GoodMood;
import strategy.behaviour.MoodBehaviour;

public class Human {

    private MoodBehaviour moodBehaviour;

    public Human() {
        moodBehaviour = new GoodMood();
    }

    public void mood() {
        moodBehaviour.mood();
    }

    public void setMoodBehaviour(MoodBehaviour mb) {
        this.moodBehaviour = mb;
    }

}
