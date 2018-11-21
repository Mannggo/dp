package visitor;

/**
 * @author 谢仲东 2018-11-21 16:58
 */
public class Visitor implements IVisitor {

    private String getBasicInfo(Orgnization org) {
        return String.format("组织名称：%s，组织经营者：%s", org.getName(), org.getOperator());
    }
    @Override
    public void visit(Company company) {
        System.out.println(getBasicInfo(company));
        System.out.println(String.format("公司产品：%s，是否上市：%s",
                company.getProductName(), company.getIsMaketing()));
    }

    @Override
    public void visit(School school) {
        System.out.println(getBasicInfo(school));
        System.out.println(String.format("教学等级：%s，学生数：%s",
                school.getEducationLevel(), school.getAmountOfStudent()));
    }
}
