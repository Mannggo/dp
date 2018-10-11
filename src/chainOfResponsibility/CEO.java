package chainOfResponsibility;

import java.util.Date;

/**
 * @author 谢仲东 2018-10-11 15:32
 */
public class CEO extends Handler{
    public CEO(Handler nextHandler, String name) {
        super(name, Handler.HANDLER_LEVEL_3, nextHandler);
    }
    @Override
    public void deal(LeaveRequest request) {
        System.out.printf("处理%s请假成功[处理人:%s/CEO, 处理时间%s]\n",
                request.getName(), this.name, new Date().toGMTString());
    }
}
