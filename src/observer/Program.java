package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 谢仲东 2018-10-18 11:26
 */
public class Program implements Observable {

    private List<Observer> observerList;
    @Override
    public Observable addObserver(Observer observer) {
        if (this.observerList == null) {
            this.observerList = new ArrayList<Observer>();
        }
        this.observerList.add(observer);
        return this;
    }

    @Override
    public Observable removeObserver(Observer observer) {
        if (this.observerList == null) {
            this.observerList = new ArrayList<Observer>();
        }
        this.observerList.remove(observer);
        return this;
    }

    @Override
    public void notifyObservers(String context) {
        if (observerList == null) {
            this.observerList = new ArrayList<Observer>();
        }
        observerList.forEach(observer -> observer.execute(context));
    }

    public int run (int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            notifyObservers(e.getMessage());
            return 0;
        }
    }
}
