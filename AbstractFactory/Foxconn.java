package AbstractFactory;

/**
 * @author AT-Fieldless
 * @create 2019-04-14 22:37
 * 描述:
 * 富士康手机代工厂
 */
public class Foxconn {

    public static void main(String[] args) {

        PhoneFactory phoneFactory = new MiPhoneFactory();
        phoneFactory.makePhoneScreen();
        phoneFactory.makePhoneSystem();

        phoneFactory = new IphoneFactory();
        phoneFactory.makePhoneScreen();
        phoneFactory.makePhoneSystem();
    }
}
