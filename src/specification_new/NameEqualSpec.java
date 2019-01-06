package specification_new;

/**
 * @author 谢仲东
 * @description 通过名字相同查找的规格
 * @since 23:15 星期日 2019/1/6
 */
public class NameEqualSpec extends CombinedSpecification {

    private String name;

    public NameEqualSpec(String name) {
        this.name = name;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return this.name.equals(user.getName());
    }
}
