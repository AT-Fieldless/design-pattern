package AbstractFactory;

/**
 * @author AT-Fieldless
 * @create 2019-04-14 17:05
 * 描述:
 * 作为AbstractFactory
 */
public interface PhoneFactory {

    public AbstractBigScreenPhone createBigScreenPhone();

    public AbstractPhotoPhone createPhotoPhone();
}
