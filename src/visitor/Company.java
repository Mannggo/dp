package visitor;

/**
 * @author 谢仲东 2018-11-21 16:53
 */
public class Company extends Orgnization {
    public Company(String name, String operator, String productName, String isMaketing) {
        this.name = name;
        this.operator = operator;
        this.productName = productName;
        this.isMaketing = isMaketing;
    }

    private String productName;
    private String isMaketing;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getIsMaketing() {
        return isMaketing;
    }

    public void setIsMaketing(String isMaketing) {
        this.isMaketing = isMaketing;
    }
}
