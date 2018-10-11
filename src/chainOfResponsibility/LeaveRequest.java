package chainOfResponsibility;

/**
 * @author 谢仲东 2018-10-11 15:18
 */
public class LeaveRequest {
    private String name;
    private Integer rank;
    private String reason;
    private Integer numberOfleaveDays;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getNumberOfleaveDays() {
        return numberOfleaveDays;
    }

    public void setNumberOfleaveDays(Integer numberOfleaveDays) {
        this.numberOfleaveDays = numberOfleaveDays;
    }

    @Override
    public String toString() {
        return "LeaveRequest{" +
                "name='" + name + '\'' +
                ", rank=" + rank +
                ", reason='" + reason + '\'' +
                ", numberOfleaveDays=" + numberOfleaveDays +
                '}';
    }
}
