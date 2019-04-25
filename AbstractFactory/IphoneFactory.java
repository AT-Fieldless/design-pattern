package AbstractFactory;

/**
 * @author AT-Fieldless
 * @create 2019-04-14 22:33
 * 描述:
 * iphone手机Factory
 */
public class IphoneFactory implements PhoneFactory {

    @Override
    public AbstractPhotoPhone createPhotoPhone() {
        return new PhotoPhoneIphone();
    }

    @Override
    public AbstractBigScreenPhone createBigScreenPhone() {
        return new BigScreenIphone();
    }
}
