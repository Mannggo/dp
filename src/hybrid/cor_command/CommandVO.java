package hybrid.cor_command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令信息类
 * @author 谢仲东 2018-12-04 10:56
 */
public class CommandVO {
    private String command;
    private List<String> params = new ArrayList<>();
    private List<String> datas = new ArrayList<>();

    private static final String DIVIDE_FLAG = " ";
    private static final String PARAM_PREFIX = "-";

    public CommandVO(String commandStr) {
        if (commandStr == null || commandStr.length() <= 0) {
            System.out.println("[create]: ===>>> fail, commandStr is empty");
        } else {
            String[] str = commandStr.split(DIVIDE_FLAG);
            this.command = str[0];
            for (int i = 1; i < str.length - 1; i++) {
                if (str[i].startsWith(PARAM_PREFIX)) {
                    params.add(str[i]);
                } else {
                    datas.add(str[i]);
                }
            }
        }
    }

    public String getCommand() {
        return command;
    }

    public List<String> getParams() {
        return params;
    }

    public List<String> getDatas() {
        return datas;
    }
}
