package visitor;

/**
 * @author 谢仲东 2018-11-21 17:02
 */
public class Client {

    public static void main(String[] args) {
        IVisitor visitor = new Visitor();

        visitor.visit(
                new School("清华", "牛逼", 5, 40000)
        );
        visitor.visit(
                new Company("小米", "军", "体重秤", "Y")
        );
    }
}
