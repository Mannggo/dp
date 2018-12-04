package hybrid.cor_command;

/**
 * @author 谢仲东 2018-12-04 10:47
 */
public abstract class CommandName {
    private CommandName nextCommandName;

    public void setNext(CommandName commandName) {
        this.nextCommandName = commandName;
    }

    public String handleInput(CommandVO vo) {
        if (vo.getParams().contains(this.getOperateParam())) {
            return this.echo(vo);
        } else {
            if (this.nextCommandName == null) {
                System.out.println("[handle error]: ===>>> no supported command");
                return null;
            } else {
                return this.nextCommandName.handleInput(vo);
            }
        }
    }

    protected abstract String echo(CommandVO vo);

    protected abstract String getOperateParam();
}
