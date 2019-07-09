package Singleton;

/**
 * @author AT-Fieldless
 * @create 2019-07-09 22:52
 * 描述:
 * MiPhone的单例模式
 */
public class MiPhone {

    private static MiPhone miPhone = new MiPhone();
    private MiPhone() {

    }
    public static MiPhone getInstance() {
        return miPhone;
    }
}
