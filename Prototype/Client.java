package Prototype;

/**
 * @author AT-Fieldless
 * @create 2019-06-13 0:04
 * 描述:
 * 客户端类
 */
public class Client {

    public static void main(String[] args) {
        MiPhone miPhone = new MiPhone();
        Phone miPhone1 = miPhone.clone();
        System.out.println(miPhone1.brand);
    }
}
