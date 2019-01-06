package specification_new;

/**
 * @author 谢仲东
 * @description
 * @since 23:22 星期日 2019/1/6
 */
public class HeightThanSpec extends CombinedSpecification {

    private Double height;

    public HeightThanSpec(Double height) {
        this.height = height;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return user.getHeight() > this.height;
    }
}
