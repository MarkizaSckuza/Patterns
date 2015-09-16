package command;

/**
 * Created by Margo on 17.09.2015.
 */
public class Test {

    public static void main(String[] args) {

        Invoker invoker = new Invoker();

        Receiver receiver = new Receiver();

        Command command1 = new ConcreteCommand1(receiver);
        Command command2 = new ConcreteCommand2(receiver);

        invoker.setCommand(command1);
        invoker.execute();

        invoker.setCommand(command2);
        invoker.execute();
        invoker.undo();
    }
}
