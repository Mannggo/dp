package hybrid.cor_command;

/**
 * @author 谢仲东 2018-12-04 14:22
 */
public class LSCommand extends Command {
    @Override
    public String execute(CommandVO vo) {
        return super.buildChain(AbstractLSCommand.class).get(0).handleInput(vo);
    }
}
