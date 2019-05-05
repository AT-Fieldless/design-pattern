package Builder;

/**
 * @author AT-Fieldless
 * @create 2019-04-25 23:37
 * 描述:
 * 小米手机生产者
 */
public class MiPhoneBuilder implements PhoneBuilder {

    private Phone miPhone = new Phone();

    private static String BRAND_NAME = "Mi";

    private static String SYSTEM_NAME = "MIUI";

    @Override
    public void buildBrandName() {
        miPhone.setBrandName(BRAND_NAME);
    }

    @Override
    public void buildSystemName() {
        miPhone.setSystemName(SYSTEM_NAME);
    }

    @Override
    public Phone getPhone() {
        return miPhone;
    }

}
