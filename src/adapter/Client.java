package adapter;

public class Client {
    public static void main(String[] args) {
        // 新的Service
        IUserServiceNew newService = new UserServiceNew();
        System.out.println(newService.getUserBasicInfo());

        // 适配器（使用的旧的Service方法，但能替换掉新的Service）
        IUserServiceNew adapter = new UserServiceAdapter();
        System.out.println(adapter.getUserBasicInfo());
    }
}
