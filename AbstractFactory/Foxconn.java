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
        AbstractBigScreenPhone abstractBigScreenPhone = phoneFactory.createBigScreenPhone();
        AbstractPhotoPhone abstractPhotoPhone = phoneFactory.createPhotoPhone();
        System.out.println(abstractBigScreenPhone.getScreenName());
        System.out.println(abstractPhotoPhone.getCameraName());

        phoneFactory = new IphoneFactory();
        abstractBigScreenPhone = phoneFactory.createBigScreenPhone();
        abstractPhotoPhone = phoneFactory.createPhotoPhone();
        System.out.println(abstractBigScreenPhone.getScreenName());
        System.out.println(abstractPhotoPhone.getCameraName());
    }
}
