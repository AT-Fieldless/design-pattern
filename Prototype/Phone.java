package Prototype;

/**
 * @author AT-Fieldless
 * @create 2019-06-12 23:58
 * 描述:
 * 手机原型类
 */
public class Phone implements Cloneable{

    protected String brand;

    public Phone clone() {
        Phone phone = null;
        try {
             phone = (Phone) super.clone();
            return phone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return phone;
        }
    }
}
