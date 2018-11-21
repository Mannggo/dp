package command;

/**
 * @author 谢仲东 2018-11-21 16:28
 */
public class Commander {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }
}
