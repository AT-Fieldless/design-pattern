package AbstractFactory;

/**
 * @author AT-Fieldless
 * @create 2019-04-14 22:33
 * 描述:
 * iphone手机Factory
 */
public class IphoneFactory extends PhoneFactory {

    private static String SCREEN_NAME = "夏普";

    private static String SYSTEM_NAME = "ios";

    public IphoneFactory() {
        System.out.println("要生产iphone了");
        this.screenName = SCREEN_NAME;
        this.systemName = SYSTEM_NAME;
    }

    @Override
    public PhoneSystem makePhoneSystem() {
        return super.makePhoneSystem();
    }

    @Override
    public PhoneScreen makePhoneScreen() {
        return super.makePhoneScreen();
    }
}
