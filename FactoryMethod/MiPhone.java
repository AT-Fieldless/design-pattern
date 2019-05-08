package FactoryMethod;

/**
 * @author AT-Fieldless
 * @create 2019-05-08 22:46
 * 描述:
 * 小米手机
 */
public class MiPhone implements Phone {


    @Override
    public String getBrandName() {
        return "Mi";
    }

    @Override
    public String getSystemName() {
        return "MIUI";
    }
}
