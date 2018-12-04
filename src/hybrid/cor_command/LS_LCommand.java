package hybrid.cor_command;

/**
 * @author 谢仲东 2018-12-04 11:56
 */
public class LS_LCommand extends AbstractLSCommand {
    @Override
    protected String echo(CommandVO vo) {
        return "total 6\n" +
                "drwxr-xr-x.  2 root root 4096 Nov 29 19:29 ad_admin\n" +
                "drwxr-xr-x.  2 root root 4096 Oct 22 14:33 advert\n" +
                "drwxr-xr-x.  7 root root 4096 Dec  4 11:43 customer\n" +
                "drwxr-xr-x   2 root root 4096 Nov 25 21:56 customer-authority\n" +
                "drwxr-xr-x.  3 root root 4096 Nov 27 04:00 data-admin\n" +
                "drwxr-xr-x.  3 root root 4096 Nov 28 08:27 distributor";
    }

    @Override
    protected String getOperateParam() {
        return L_PARAM;
    }
}
