package chainOfResponsibility;

/**
 * @author 谢仲东 2018-10-11 15:16
 */
public abstract class Handler {
    public static final Integer HANDLER_LEVEL_1 = 1;
    public static final Integer HANDLER_LEVEL_2 = 2;
    public static final Integer HANDLER_LEVEL_3 = 3;
    private Integer handleLevel = 0;
    private Handler nextHandler;
    protected String name;
    public Handler(String name, Integer handleLevel, Handler nextHandler) {
        this.handleLevel = handleLevel;
        this.nextHandler = nextHandler;
        this.name = name;
    }
    public abstract void deal(LeaveRequest request);
    public void handle(LeaveRequest request) {
        if (this.handleLevel >= request.getRank()) {
            this.deal(request);
        } else {
            if (this.nextHandler != null) {
                System.out.printf("%s无权处理该请求，将请求投递给上级%s\n", name, this.nextHandler.name);
                this.nextHandler.handle(request);
            } else {
                System.out.println("搁置请求,记录日志: " + request.toString());
            }
        }
    }
}
