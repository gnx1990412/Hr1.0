package cn.bdqn.entity;

/**
 *
 *
 *
 *           职位表
 1）ID
 2）职位编码：  （自动生成）   Job code
 3）是否启用      int    enable
 4）名称 ：  name
 5）职位分类ID：     （对应职位分类表ID） jobType
 6）所属部门ID：（对应部门ID）    department
 7）职位描述：    info
 8）备注：Remarks
 */
public class Job {
   private int id,jobTypeID,departmentID,enableLevle;
    private String Jobcode,name,info,Remarks;
    private JobType jobType;
    private  Department department;

    @Override
    public String toString ( ) {
        return "Job{" +
                "id=" + id +
                ", jobTypeID=" + jobTypeID +
                ", departmentID=" + departmentID +
                ", enableLevle=" + enableLevle +
                ", Jobcode='" + Jobcode + '\'' +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", Remarks='" + Remarks + '\'' +
                ", jobType=" + jobType +
                ", department=" + department +
                '}';
    }

    public int getId ( ) {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public int getJobTypeID ( ) {
        return jobTypeID;
    }

    public void setJobTypeID ( int jobTypeID ) {
        this.jobTypeID = jobTypeID;
    }

    public int getDepartmentID ( ) {
        return departmentID;
    }

    public void setDepartmentID ( int departmentID ) {
        this.departmentID = departmentID;
    }

    public int getEnableLevle ( ) {
        return enableLevle;
    }

    public void setEnableLevle ( int enableLevle ) {
        this.enableLevle = enableLevle;
    }

    public String getJobcode ( ) {
        return Jobcode;
    }

    public void setJobcode ( String jobcode ) {
        Jobcode = jobcode;
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

    public String getRemarks ( ) {
        return Remarks;
    }

    public void setRemarks ( String remarks ) {
        Remarks = remarks;
    }

    public JobType getJobType ( ) {
        return jobType;
    }

    public void setJobType ( JobType jobType ) {
        this.jobType = jobType;
    }

    public Department getDepartment ( ) {
        return department;
    }

    public void setDepartment ( Department department ) {
        this.department = department;
    }
}
