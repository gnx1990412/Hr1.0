package cn.bdqn.entity;

/**
 职称设置
 1）ID
 2）职称编码：       jobTitleCode
 3）职称名称;    Name
 * Created by Administrator on 2018/3/13.
 */
public class jobTitle {
    private int id,departmentId,enableLevleId;
    private String jobTitleCode,Name,info,Remarks;
    private EnableLevel enableLevel;
    private Department department;

    @Override
    public String toString ( ) {
        return "jobTitle{" +
                "id=" + id +
                ", departmentId=" + departmentId +
                ", enableLevleId=" + enableLevleId +
                ", jobTitleCode='" + jobTitleCode + '\'' +
                ", Name='" + Name + '\'' +
                ", info='" + info + '\'' +
                ", Remarks='" + Remarks + '\'' +
                ", enableLevel=" + enableLevel +
                ", department=" + department +
                '}';
    }

    public int getId ( ) {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public int getDepartmentId ( ) {
        return departmentId;
    }

    public void setDepartmentId ( int departmentId ) {
        this.departmentId = departmentId;
    }

    public int getEnableLevleId ( ) {
        return enableLevleId;
    }

    public void setEnableLevleId ( int enableLevleId ) {
        this.enableLevleId = enableLevleId;
    }

    public String getJobTitleCode ( ) {
        return jobTitleCode;
    }

    public void setJobTitleCode ( String jobTitleCode ) {
        this.jobTitleCode = jobTitleCode;
    }

    public String getName ( ) {
        return Name;
    }

    public void setName ( String name ) {
        Name = name;
    }

    public String getInfo ( ) {
        return info;
    }

    public void setInfo ( String info ) {
        this.info = info;
    }

    public String getRemarks ( ) {
        return Remarks;
    }

    public void setRemarks ( String remarks ) {
        Remarks = remarks;
    }

    public EnableLevel getEnableLevel ( ) {
        return enableLevel;
    }

    public void setEnableLevel ( EnableLevel enableLevel ) {
        this.enableLevel = enableLevel;
    }

    public Department getDepartment ( ) {
        return department;
    }

    public void setDepartment ( Department department ) {
        this.department = department;
    }
}
