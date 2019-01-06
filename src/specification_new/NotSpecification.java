package specification_new;

/**
 * @author 谢仲东
 * @description
 * @since 23:13 星期日 2019/1/6
 */
public class NotSpecification extends CombinedSpecification {

    private Specification specification;

    public NotSpecification(Specification specification) {
        this.specification = specification;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return !this.specification.isSatisfiedBy(user);
    }
}
