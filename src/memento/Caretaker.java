package memento;

import java.util.HashMap;

/**
 * @author 谢仲东 2018-10-18 15:12
 */
public class Caretaker {
    private HashMap<String, Memento> mementoMap = new HashMap<>();

    public void saveMemento(String idx, Memento memento) {
        mementoMap.putIfAbsent(idx, memento);
    }

    public Memento getMemento(String idx) {
        return mementoMap.get(idx);
    }
}
