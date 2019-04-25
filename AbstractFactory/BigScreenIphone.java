package AbstractFactory;

/**
 * @author AT-Fieldless
 * @create 2019-04-24 23:19
 * 描述:
 * 大屏iphone
 */
public class BigScreenIphone extends AbstractBigScreenPhone {

    private static String BRAND_NAME = "Apple";

    private static String SCREEN_NAME = "康宁";

    @Override
    public String getBrandName() {
        return BRAND_NAME;
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

}
