package strategy;

/**
 * @author 谢仲东 2018-11-21 16:14
 */
public class TaobaoChannel implements Channel{
    @Override
    public void execute() {
        System.out.println("淘宝销售");
    }
}
