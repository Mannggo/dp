package observer;

/**
 * 观察者接口
 * @author 谢仲东 2018-10-18 10:55
 */
public interface Observer {

    // 响应事件的方法
    void execute(String context);
}
