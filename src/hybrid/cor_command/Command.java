package hybrid.cor_command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 谢仲东 2018-12-04 14:10
 */
public abstract class Command {
    public abstract String execute(CommandVO vo);

    protected List<? extends CommandName> buildChain(Class<? extends CommandName> clazz) {
        List<Class> classes = ClassUtils.getSonClass(clazz);
        List<CommandName> chain = new ArrayList<>();
        for (Class c : classes) {
            CommandName cn = null;
            try {
                cn = (CommandName) Class.forName(c.getName()).newInstance();
            } catch (Exception e) {
                System.out.println("[chain build error]: ===>>> " + e.getMessage());
            }
            if (chain.size() > 0) {
                chain.get(chain.size() - 1).setNext(cn);
            }
            chain.add(cn);
        }
        return chain;
    }
}
