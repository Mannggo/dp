package visitor;

/**
 * @author 谢仲东 2018-11-21 16:52
 */
public class School extends Orgnization{
    public School(String name, String operator, Integer educationLevel, Integer amountOfStudent) {
        this.name = name;
        this.operator = operator;
        this.educationLevel = educationLevel;
        this.amountOfStudent = amountOfStudent;
    }

    private Integer educationLevel;
    private Integer amountOfStudent;

    public Integer getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(Integer educationLevel) {
        this.educationLevel = educationLevel;
    }

    public Integer getAmountOfStudent() {
        return amountOfStudent;
    }

    public void setAmountOfStudent(Integer amountOfStudent) {
        this.amountOfStudent = amountOfStudent;
    }
}
