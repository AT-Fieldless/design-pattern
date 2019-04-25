package AbstractFactory;

/**
 * @author AT-Fieldless
 * @create 2019-04-14 22:30
 * 描述:
 * 小米手机Factory
 */
public class MiPhoneFactory implements PhoneFactory {

    @Override
    public AbstractBigScreenPhone createBigScreenPhone() {
        return new BigScreenMiPhone();
    }

    @Override
    public AbstractPhotoPhone createPhotoPhone() {
        return new PhotoPhoneMi();
    }
}
