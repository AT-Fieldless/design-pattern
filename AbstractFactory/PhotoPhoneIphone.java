package AbstractFactory;

/**
 * @author AT-Fieldless
 * @create 2019-04-24 23:22
 * 描述:
 * 拍照iphone
 */
public class PhotoPhoneIphone extends AbstractPhotoPhone {

    private static String BRAND_NAME = "Apple";

    private static String CRANME_NAME = "Sony";

    @Override
    public String getBrandName() {
        return BRAND_NAME;
    }

    @Override
    public String getCameraName() {
        return CRANME_NAME;
    }
}
