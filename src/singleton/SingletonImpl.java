package singleton;

/**
 * 单例模式场景
 * @author 谢仲东 2018/8/6 20:59
 * Description:
 */
public class SingletonImpl {
    public static void main(String[] args) {
        HighFrequencyObject obj = HighFrequencyObject.getInstance();

        obj.method1();
        obj.method2();
    }
}

class HighFrequencyObject {

    private static HighFrequencyObject instance;

    static {
         instance = new HighFrequencyObject();
    }

    /**
     * 获取静态实例方法
     */
    public static HighFrequencyObject getInstance () {
        return instance;
    }

    /**
     * 私有化构造函数，限制外部创建对象
     */
    private HighFrequencyObject() {
        System.out.println("做一些耗时间耗资源的初始化操作...");
    };

    public void method1() {
        System.out.println("成员方法1...");
    }

    public void method2() {
        System.out.println("成员方法2...");
    }
}
