package specification_new;

/**
 * @author 谢仲东
 * @description 规格接口
 * @since 22:54 星期日 2019/1/6
 */
public interface Specification {

    boolean isSatisfiedBy(User user);

    /**
     * 查询条件中的and操作
     * @param specification
     * @return
     */
    Specification and(Specification specification);

    /**
     * 查询条件中的or操作
     * @param specification
     * @return
     */
    Specification or(Specification specification);

    /**
     * 查询条件中的not操作
     * @return
     */
    Specification not();
}
