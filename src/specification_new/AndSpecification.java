package specification_new;

/**
 * @author 谢仲东
 * @description “并” 操作复合规格
 * @since 23:08 星期日 2019/1/6
 */
public class AndSpecification extends CombinedSpecification {

    private Specification left;

    private Specification right;

    public AndSpecification(Specification left, Specification right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return left.isSatisfiedBy(user) && right.isSatisfiedBy(user);
    }
}
