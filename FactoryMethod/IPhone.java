package FactoryMethod;

/**
 * @author AT-Fieldless
 * @create 2019-05-08 22:47
 * 描述:
 * iphone
 */
public class IPhone implements Phone {
    @Override
    public String getBrandName() {
        return "Apple";
    }

    @Override
    public String getSystemName() {
        return "Ios";
    }
}
