package chainOfResponsibility;

/**
 * @author 谢仲东 2018-10-11 15:12
 */
public class ChainOfResponsibilityImpl {
    public static void main(String[] args) {
        CEO ceo = new CEO(null, "马芸");
        Manager manager = new Manager(ceo, "方丈");
        Clerk clerk = new Clerk(manager, "云长");
        LeaveRequest request = new LeaveRequest();
        request.setName("Tony");
        request.setNumberOfleaveDays(12);
        request.setRank(3);
        request.setReason("回家待产");
        clerk.handle(request);
    }
}
