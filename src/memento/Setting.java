package memento;

import java.time.LocalDateTime;

/**
 * @author 谢仲东 2018-10-18 14:41
 */
public class Setting {

    private Boolean notifySwitch;

    private LocalDateTime notifyTime;

    public Memento createMemento() {
        return new Memento(BeanUtils.backupProp(this));
    }

    public void restoreMemento(Memento memento) {
        BeanUtils.restoreProp(this, memento.getProps());
    }
    public Boolean getNotifySwitch() {
        return notifySwitch;
    }

    public void setNotifySwitch(Boolean notifySwitch) {
        this.notifySwitch = notifySwitch;
    }

    public LocalDateTime getNotifyTime() {
        return notifyTime;
    }

    public void setNotifyTime(LocalDateTime notifyTime) {
        this.notifyTime = notifyTime;
    }

    @Override
    public String toString() {
        return "Setting{" +
                "notifySwitch=" + notifySwitch +
                ", notifyTime=" + notifyTime.toString() +
                '}';
    }
}
