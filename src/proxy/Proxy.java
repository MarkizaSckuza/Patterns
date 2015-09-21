package proxy;

/**
 * Created by Margo on 21.09.2015.
 */
public class Proxy implements CommandExecutor {

    private CommandExecutor executor;
    private Boolean isAdmin;

    public Proxy(User user) {
        this.executor = new CommandExecutorImpl();
        this.isAdmin = user.getIsAdmin();
    }

    @Override
    public void runCommand(String command) throws Exception {
        if (isAdmin) {
            executor.runCommand(command);
        } else {
            if (command.trim().contains("rm")) {
                throw new Exception("The rm command is allowed only for admin users!");
            } else {
                executor.runCommand(command);
            }
        }
    }
}
