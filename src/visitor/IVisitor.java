package visitor;

/**
 * @author 谢仲东 2018-11-21 16:47
 */
public interface IVisitor {

    void visit(Company company);

    void visit(School school);
}
