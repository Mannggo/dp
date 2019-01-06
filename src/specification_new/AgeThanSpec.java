package specification_new;

/**
 * @author 谢仲东
 * @description 通过年龄是否大于查找的规格
 * @since 23:15 星期日 2019/1/6
 */
public class AgeThanSpec extends CombinedSpecification {

    private Integer age;

    public AgeThanSpec(Integer age) {
        this.age = age;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return user.getAge() > this.age;
    }
}
