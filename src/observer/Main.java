package observer;

/**
 * @author 谢仲东 2018-10-18 11:29
 */
public class Main {

    public static void main(String[] args) {

        Program program = new Program();
        program.addObserver(new LogRecorder()).addObserver(new MailSender());

        int res = program.run(5,0);
    }
}
