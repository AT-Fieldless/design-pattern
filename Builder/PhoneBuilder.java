package Builder;

/**
 * @author AT-Fieldless
 * @create 2019-04-25 23:22
 * 描述:
 * 定义builder所需的接口
 */
public interface PhoneBuilder {

    public void buildBrandName();

    public void buildSystemName();

    public Phone getPhone();
}
