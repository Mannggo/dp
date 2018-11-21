package command;

/**
 * @author 谢仲东 2018-11-21 16:21
 */
public abstract class Command {

    protected Army army = new Army();

    public abstract void execute();
}
