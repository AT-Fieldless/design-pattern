package AbstractFactory;

/**
 * @author AT-Fieldless
 * @create 2019-04-14 22:30
 * 描述:
 * 小米手机Factory
 */
public class MiPhoneFactory extends PhoneFactory {

    public MiPhoneFactory() {
        System.out.println("要生产小米手机了");
        this.screenName = "京东方";
        this.systemName = "miui";
    }

    @Override
    public PhoneScreen makePhoneScreen() {
        return super.makePhoneScreen();
    }

    @Override
    public PhoneSystem makePhoneSystem() {
        return super.makePhoneSystem();
    }
}
