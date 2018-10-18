package observer;

/**
 * @author 谢仲东 2018-10-18 10:57
 */
public class MailSender implements Observer {
    @Override
    public void execute(String context) {
        System.out.println("发送邮箱：服务器出现错误了！[" + context + "]");
    }
}
