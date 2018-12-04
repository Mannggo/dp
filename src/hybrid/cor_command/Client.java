package hybrid.cor_command;

/**
 * @author 谢仲东 2018-12-04 14:24
 */
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.setCommand(new LSCommand());

        invoker.invoke(new CommandVO("ls -l"));
    }
}
