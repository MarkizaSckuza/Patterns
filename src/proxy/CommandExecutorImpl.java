package proxy;

/**
 * Created by Margo on 21.09.2015.
 */
public class CommandExecutorImpl implements CommandExecutor {


    public CommandExecutorImpl() {
    }

    @Override
    public void runCommand(String command) {
        System.out.println("Command " + command + " is executed");
    }
}
