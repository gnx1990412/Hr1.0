package cn.bdqn.entity;


public class SalaryType {
    /*
    *
    *                 薪酬表：salaryType
            1）id
            2）薪酬代码SALARY CODE
            3）排序依据： int  order
            4）name
            5）描述;info
            6）启用级别：enableLEvel
    * */

    private int id,order,enableLevleId;
    private String salary ,name,info;

    private  EnableLevel enableLevel;

    @Override
    public String toString ( ) {
        return "SalaryType{" +
                "id=" + id +
                ", order=" + order +
                ", enableLevleId=" + enableLevleId +
                ", salary='" + salary + '\'' +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", enableLevel=" + enableLevel +
                '}';
    }

    public int getId ( ) {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public int getOrder ( ) {
        return order;
    }

    public void setOrder ( int order ) {
        this.order = order;
    }

    public int getEnableLevleId ( ) {
        return enableLevleId;
    }

    public void setEnableLevleId ( int enableLevleId ) {
        this.enableLevleId = enableLevleId;
    }

    public String getSalary ( ) {
        return salary;
    }

    public void setSalary ( String salary ) {
        this.salary = salary;
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getInfo ( ) {
        return info;
    }

    public void setInfo ( String info ) {
        this.info = info;
    }

    public EnableLevel getEnableLevel ( ) {
        return enableLevel;
    }

    public void setEnableLevel ( EnableLevel enableLevel ) {
        this.enableLevel = enableLevel;
    }
}

