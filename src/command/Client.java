package command;

/**
 * @author 谢仲东 2018-11-21 16:27
 */
public class Client {

    public static void main(String[] args) {
        Commander commander = new Commander();
        commander.setCommand(new FireCommand());
        commander.execute();
        commander.setCommand(new EscapeCommand());
        commander.execute();
    }
}
