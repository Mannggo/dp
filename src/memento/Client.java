package memento;

import java.time.LocalDateTime;

/**
 * @author 谢仲东 2018-10-18 15:23
 */
public class Client {

    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();
        Setting setting = new Setting();
        setting.setNotifySwitch(false);
        setting.setNotifyTime(LocalDateTime.now());

        System.out.println("初始状态：" + setting);
        caretaker.saveMemento("临时备份", setting.createMemento());
        setting.setNotifySwitch(true);
        setting.setNotifyTime(LocalDateTime.now().plusDays(2));
        System.out.println("修改后：" + setting);
        setting.restoreMemento(caretaker.getMemento("临时备份"));
        System.out.println("恢复后：" + setting);


    }
}
