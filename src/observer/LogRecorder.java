package observer;

/**
 * @author 谢仲东 2018-10-18 10:58
 */
public class LogRecorder implements Observer {
    @Override
    public void execute(String context) {
        System.out.println("数据库记录：服务器出现错误了！[" + context + "]");
    }
}
