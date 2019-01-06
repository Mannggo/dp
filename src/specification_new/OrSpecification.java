package specification_new;

/**
 * @author 谢仲东
 * @description “或” 操作复合规格
 * @since 23:11 星期日 2019/1/6
 */
public class OrSpecification extends CombinedSpecification {

    private Specification left;

    private Specification right;

    public OrSpecification(Specification left, Specification right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return this.right.isSatisfiedBy(user) || this.left.isSatisfiedBy(user);
    }
}
