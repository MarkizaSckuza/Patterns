package command;

/**
 * Created by Margo on 16.09.2015.
 */
public interface Command {
    public void execute();
    public void undo();
}
