package specification_new;

/**
 * @author 谢仲东
 * @description 组合规格
 * @since 23:03 星期日 2019/1/6
 */
public abstract class CombinedSpecification implements Specification{

    @Override
    public Specification and(Specification specification) {
        return new AndSpecification(this, specification);
    }

    @Override
    public Specification or(Specification specification) {
        return new OrSpecification(this, specification);
    }

    @Override
    public Specification not() {
        return new NotSpecification(this);
    }
}
