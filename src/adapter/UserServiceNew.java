package adapter;

/**
 * 目标对象
 */
public class UserServiceNew implements IUserServiceNew {
    private FakeDAO fakeDAO = new FakeDAO();

    @Override
    public String getUserBasicInfo() {
        return fakeDAO.getBasicInfo();
    }
}
