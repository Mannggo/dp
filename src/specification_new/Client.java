package specification_new;

import java.util.ArrayList;

/**
 * @author 谢仲东
 * @description 实现一个类似SQL查询的功能
 * @since 22:53 星期日 2019/1/6
 */
public class Client {

    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();

        users.add(new User(11, "Jerry", 171.5));
        users.add(new User(18, "Jetty", 171.3));
        users.add(new User(14, "Oran", 151.7));

        // 查询年龄大于12 身高高于120 且名字不为Jetty 的实体
        Specification condition = new AgeThanSpec(12).and(new HeightThanSpec(120.0)).and(new NameEqualSpec("Jetty").not());
        users.forEach(u -> {
            if (condition.isSatisfiedBy(u)) {
                System.out.println(u);
            }
        });
    }
}
