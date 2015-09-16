package command;

/**
 * Created by Margo on 17.09.2015.
 */
public class ConcreteCommand1 implements Command {

    Receiver receiver;

    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action1();
    }

    @Override
    public void undo() {
        receiver.action2();
    }
}
