package strategy;

/**
 * @author 谢仲东 2018-11-21 16:12
 */
public class WechatChannel implements Channel  {
    @Override
    public void execute() {
        System.out.println("微商销售");
    }
}
