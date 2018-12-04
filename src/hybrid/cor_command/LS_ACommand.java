package hybrid.cor_command;

/**
 * @author 谢仲东 2018-12-04 11:54
 */
public class LS_ACommand extends AbstractLSCommand {
    @Override
    protected String echo(CommandVO vo) {
        return "\\.\n\\..\n\\usr\n\\data";
    }

    @Override
    protected String getOperateParam() {
        return A_PARAM;
    }
}
