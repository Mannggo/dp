package hybrid.cor_command;

/**
 * @author 谢仲东 2018-12-04 14:09
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void invoke(CommandVO vo) {
        this.command.execute(vo);
    }
}
