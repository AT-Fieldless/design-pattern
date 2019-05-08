package FactoryMethod;

/**
 * @author AT-Fieldless
 * @create 2019-05-08 23:02
 * 描述:
 * 客户
 */
public class Client {
    public static void main(String[] args) {
        ConcreatePhoneFactroy concreatePhoneFactroy = new ConcreatePhoneFactroy();
        Phone phone = concreatePhoneFactroy.createPhone(MiPhone.class);
        System.out.println(phone.getBrandName());
        System.out.println(phone.getSystemName());
        phone = concreatePhoneFactroy.createPhone(IPhone.class);
        System.out.println(phone.getBrandName());
        System.out.println(phone.getSystemName());
    }
}
