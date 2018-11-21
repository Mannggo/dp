package strategy;

/**
 * @author 谢仲东 2018-11-21 16:15
 */
public class Client {

    public static void main(String[] args) {

        ChannelContext ctx = new ChannelContext(new WechatChannel());
        ctx.execute();

        ctx.setChannel(new TaobaoChannel());
        ctx.execute();
    }
}
