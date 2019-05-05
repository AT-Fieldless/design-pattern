package Builder;

/**
 * @author AT-Fieldless
 * @create 2019-04-25 23:21
 * 描述:
 * 使用者
 */
public class Director {

    private PhoneBuilder phoneBuilder;

    public void setPhoneBuilder(PhoneBuilder phoneBuilder) {
        this.phoneBuilder = phoneBuilder;
    }

    public Phone construct() {
        phoneBuilder.buildBrandName();
        phoneBuilder.buildSystemName();
        return phoneBuilder.getPhone();
    }
}
