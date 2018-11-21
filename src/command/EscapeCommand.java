package command;

/**
 * @author 谢仲东 2018-11-21 16:23
 */
public class EscapeCommand extends Command{
    @Override
    public void execute() {
        this.army.cover();
        this.army.escape();
    }
}
