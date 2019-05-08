package FactoryMethod;

/**
 * @author AT-Fieldless
 * @create 2019-05-08 22:48
 * 描述:
 * 手机工厂的抽象类
 */
public abstract class AbstractPhoneFactory {

    public abstract Phone createPhone(Class className);
}
