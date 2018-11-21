package command;

/**
 * @author 谢仲东 2018-11-21 16:27
 */
public class FireCommand extends Command {
    @Override
    public void execute() {
        this.army.reload();
        this.army.fire();
    }
}
