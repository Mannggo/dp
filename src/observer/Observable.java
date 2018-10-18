package observer;

/**
 * 被观察者接口
 * @author 谢仲东 2018-10-18 11:00
 */
public interface Observable {
    //增加一个观察者
    Observable addObserver(Observer observer);
    //移除一个观察者
    Observable removeObserver(Observer observer);
    //给观察者发通知
    void notifyObservers(String context);
}
