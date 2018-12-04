package adapter;

public class FakeDAO {
    public String getUserName() {
        return "用户名是：xxx";
    }

    public String getUserGender() {
        return "性别是：男";
    }

    public Integer getUserAge() {
        return 18;
    }

    public String getBasicInfo() {
        return "用户名是：xxx\n性别是：男\n18";
    }
}
