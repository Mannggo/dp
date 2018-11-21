package strategy;

/**
 * @author 谢仲东 2018-11-21 16:15
 */
public class ChannelContext {

    private Channel channel;

    public ChannelContext(Channel channel) {
        this.channel = channel;
    }

    public void execute() {
        this.channel.execute();
    }
    public void setChannel(Channel channel) {
        this.channel = channel;
    }
}
