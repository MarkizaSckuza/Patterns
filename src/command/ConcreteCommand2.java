package command;

/**
 * Created by Margo on 17.09.2015.
 */
public class ConcreteCommand2 implements Command {

    Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action2();
    }

    @Override
    public void undo() {
        receiver.action1();
    }
}
