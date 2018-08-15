package factorymethod;

/**
 * 工厂方法模式场景
 * @author 谢仲东 2018/8/6 20:58
 * Description:
 */
public class FactoryMethodImpl {

    public static void main(String[] args) {
        Mobilephone phone1 = MobilephoneFactory.createMobilePhone(IntelligentMobilephone.class);
        Mobilephone phone2 = MobilephoneFactory.createMobilePhone(GeriatricMobilephone.class);

        phone1.ring();
        phone2.ring();

        phone1.dial("110");
        phone2.dial("110");

        /*
        output：
        智能手机响铃
        老人手机响铃

        智能手机拨号：110
        老人手机拨号：110

         */
    }
}

/**
 * 手机接口
 */
interface Mobilephone {
    void ring();
    void dial(String number);
}

/**
 * 智能手机实现类
 */
class IntelligentMobilephone implements Mobilephone{

    @Override
    public void ring() {
        System.out.println("智能手机响铃");
    }

    @Override
    public void dial(String number) {
        System.out.println("智能手机拨号：" + number);
    }
}

/**
 * 老人手机实现类
 */
class GeriatricMobilephone implements Mobilephone{

    @Override
    public void ring() {
        System.out.println("老人手机响铃");
    }

    @Override
    public void dial(String number) {
        System.out.println("老人手机拨号：" + number);
    }
}

/**
 * 手机工厂
 */
class MobilephoneFactory {
    public static <T extends Mobilephone> T createMobilePhone(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}


