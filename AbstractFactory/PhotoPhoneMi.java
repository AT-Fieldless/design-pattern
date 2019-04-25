package AbstractFactory;

/**
 * @author AT-Fieldless
 * @create 2019-04-24 23:24
 * 描述:
 * 小米拍照手机
 */
public class PhotoPhoneMi extends AbstractPhotoPhone {

    private static String BRAND_NAME = "Mi";

    private static String CAMERA_NAME = "Sharp";

    @Override
    public String getBrandName() {
        return BRAND_NAME;
    }

    @Override
    public String getCameraName() {
        return CAMERA_NAME;
    }
}
