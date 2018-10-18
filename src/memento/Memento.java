package memento;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 备忘录
 * @author 谢仲东 2018-10-18 14:50
 */
public class Memento {
    private HashMap<String, Object> props;

    public Memento(HashMap<String, Object> props) {
        this.props = props;
    }

    public HashMap<String, Object> getProps() {
        return props;
    }

    public void setProps(HashMap<String, Object> props) {
        this.props = props;
    }
}
