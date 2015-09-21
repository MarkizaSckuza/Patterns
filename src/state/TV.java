package state;

/**
 * Created by Margo on 21.09.2015.
 */
public class TV {

    private State state;

    public TV(State state) {
        this.state = state;
    }

    public void acton() {
        state.action();
    }

    public void setState(State state) {
        this.state = state;
    }
}
