package Builder;

/**
 * @author AT-Fieldless
 * @create 2019-04-25 23:52
 * 描述:
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        director.setPhoneBuilder(new MiPhoneBuilder());
        Phone phone = director.construct();
        System.out.println(phone);
    }
}
