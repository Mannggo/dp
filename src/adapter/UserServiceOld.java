package adapter;

/**
 * 被适配的对象
 */
public class UserServiceOld implements IUserServiceOld {
    private FakeDAO fakeDAO = new FakeDAO();

    @Override
    public String getUserName() {
        return fakeDAO.getUserName();
    }

    @Override
    public String getUserGender() {
        return fakeDAO.getUserGender();
    }

    @Override
    public Integer getUserAge() {
        return fakeDAO.getUserAge();
    }
}
