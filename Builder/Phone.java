package Builder;

/**
 * @author AT-Fieldless
 * @create 2019-04-25 23:36
 * 描述:
 * 手机类，每个手机都需要的组件
 */
public class Phone {

    private String brandName;
    private String systemName;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brandName='" + brandName + '\'' +
                ", systemName='" + systemName + '\'' +
                '}';
    }
}
