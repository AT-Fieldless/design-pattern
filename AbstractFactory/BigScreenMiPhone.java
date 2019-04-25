package AbstractFactory;

/**
 * @author AT-Fieldless
 * @create 2019-04-24 23:21
 * 描述:
 * 大屏小米
 */
public class BigScreenMiPhone extends AbstractBigScreenPhone{

    private static String BRAND_NAME = "Mi";

    private static String SCREEN_NAME = "京东方";

    @Override
    public String getBrandName() {
        return BRAND_NAME;
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }
}
