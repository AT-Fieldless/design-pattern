package AbstractFactory;

/**
 * @author AT-Fieldless
 * @create 2019-04-14 17:05
 * 描述:
 * 作为AbstractFactory
 */
public abstract class PhoneFactory {

    protected String screenName;

    protected String systemName;

    public PhoneScreen makePhoneScreen() {
        System.out.println("生产的屏幕：" + this.screenName);
        return new PhoneScreen(screenName);
    }

    public PhoneSystem makePhoneSystem() {
        System.out.println("生产的系统是：" + this.systemName);
        return new PhoneSystem(systemName);
    }
}
