package abstractfactory;

/**
 * @author 谢仲东 2018/8/7 21:04
 * Description:
 */
public class AbstractFactoryImpl {

    public static void main(String[] args) {
        MobilephoneFactory huaweiFactory = new HuaweiMobileFactory();
        MobilephoneFactory nokiaFactory = new NokiaMobileFactory();

        Mobilephone huaweiGeriatricMobile = huaweiFactory.createGeriatricMobilephone();
        Mobilephone huaweiIntelligentMobile = huaweiFactory.createIntelligentMobilephone();

        Mobilephone nikiaGeriatricMobile = nokiaFactory.createGeriatricMobilephone();
        Mobilephone nokiaIntelligentMobile = nokiaFactory.createIntelligentMobilephone();

        System.out.println("华为智能手机行为：");
        huaweiIntelligentMobile.speciality();
        huaweiIntelligentMobile.ring();
        huaweiIntelligentMobile.dial("110");
        System.out.println("华为老人手机行为：");
        huaweiGeriatricMobile.speciality();
        huaweiGeriatricMobile.ring();
        huaweiGeriatricMobile.dial("110");
        System.out.println("诺基亚智能手机行为：");
        nokiaIntelligentMobile.speciality();
        nokiaIntelligentMobile.ring();
        nokiaIntelligentMobile.dial("110");
        System.out.println("诺基亚老人手机行为：");
        nikiaGeriatricMobile.speciality();
        nikiaGeriatricMobile.ring();
        nikiaGeriatricMobile.dial("110");

    }
}
/**
 * 手机接口
 */
interface Mobilephone {
    void ring();
    void dial(String number);
    void speciality();
}

abstract class HuaweiMobilephone implements Mobilephone{
    @Override
    public void speciality() {
        System.out.println("\t华为手机刷卡");
    }
}

abstract class NokiaMobilephone implements Mobilephone{
    @Override
    public void speciality() {
        System.out.println("\t诺基亚手机砸核桃");
    }
}
/**
 * 华为智能手机实现类
 */
class HuaweiIntelligentMobilephone extends HuaweiMobilephone{
    public void ring(){
        System.out.println("\t华为智能手机响铃");
    }
    public void dial(String number){
        System.out.println("\t华为智能手机拨号：" + number);
    }

}

/**
 * 华为老人手机实现类
 */
class HuaweiGeriatricMobilephone extends HuaweiMobilephone {

    @Override
    public void ring() {
        System.out.println("\t老人手机响铃");
    }

    @Override
    public void dial(String number) {
        System.out.println("\t老人手机拨号：" + number);
    }

}

/**
 * 诺基亚老人手机实现类
 */
class NokiaIntelligentMobilephone extends NokiaMobilephone {

    @Override
    public void ring() {
        System.out.println("\t诺基亚智能手机响铃");
    }

    @Override
    public void dial(String number) {
        System.out.println("\t诺基亚智能手机拨号：" + number);
    }

}

/**
 * 诺基亚智能手机实现类
 */
class NokiaGeriatricMobilephone extends NokiaMobilephone {

    @Override
    public void ring() {
        System.out.println("\t诺基亚老人手机响铃");
    }

    @Override
    public void dial(String number) {
        System.out.println("\t诺基亚老人手机拨号：" + number);
    }

}
/**
 * 手机工厂
 */
interface MobilephoneFactory {
    Mobilephone createIntelligentMobilephone();
    Mobilephone createGeriatricMobilephone();
}

class HuaweiMobileFactory implements MobilephoneFactory{

    @Override
    public HuaweiIntelligentMobilephone createIntelligentMobilephone() {
        return new HuaweiIntelligentMobilephone();
    }

    @Override
    public HuaweiGeriatricMobilephone createGeriatricMobilephone() {
        return new HuaweiGeriatricMobilephone();
    }
}

class NokiaMobileFactory implements MobilephoneFactory{

    @Override
    public NokiaIntelligentMobilephone createIntelligentMobilephone() {
        return new NokiaIntelligentMobilephone();
    }

    @Override
    public NokiaGeriatricMobilephone createGeriatricMobilephone() {
        return new NokiaGeriatricMobilephone();
    }
}



