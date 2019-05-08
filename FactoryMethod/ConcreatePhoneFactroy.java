package FactoryMethod;

import java.lang.reflect.InvocationTargetException;

/**
 * @author AT-Fieldless
 * @create 2019-05-08 22:58
 * 描述:
 * 手机工厂具体实现类
 */
public class ConcreatePhoneFactroy extends AbstractPhoneFactory{

    @Override
    public Phone createPhone(Class className) {
        try {
            Phone phone = null;
            try {
                phone = (Phone) Class.forName(className.getName()).getDeclaredConstructor().newInstance();
            } catch (InvocationTargetException | NoSuchMethodException e) {
                e.printStackTrace();
            }
            return phone;
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
