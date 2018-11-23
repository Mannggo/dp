package adapter;

/**
 * 适配器对象，将旧版的Service改造成新版的Service
 */
public class UserServiceAdapter extends UserServiceOld implements IUserServiceNew {
    @Override
    public String getUserBasicInfo() {
        return this.getUserName()
                + "\n" + this.getUserGender()
                + "\n" + this.getUserAge();
    }
}
