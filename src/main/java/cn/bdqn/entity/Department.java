package cn.bdqn.entity;


public class Department {
    /*
    *1）ID
    2）组织（后面也可以叫部门）编码 :departmentCode  自动生成
    3）组织简称     shortname
    4）组织全称：   fullname
    5）组织父ID     fatherId
    6）组织级别：   Level （不对前段直接显示）
    7）地址         address
    8）简介       info
    9）备注  			Remarks
    10）是否启用    int  enable
    *
    * */
    private int id,Level,fatherId,enableLevelId;
    private String  departmentCode,shortname,fullname,address,info,Remarks;
    private EnableLevel enableLevel;

    @Override
    public String toString ( ) {
        return "Department{" +
                "id=" + id +
                ", Level=" + Level +
                ", fatherId=" + fatherId +
                ", enableLevelId=" + enableLevelId +
                ", departmentCode='" + departmentCode + '\'' +
                ", shortname='" + shortname + '\'' +
                ", fullname='" + fullname + '\'' +
                ", address='" + address + '\'' +
                ", info='" + info + '\'' +
                ", Remarks='" + Remarks + '\'' +
                ", enableLevel=" + enableLevel +
                '}';
    }

    public int getId ( ) {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public int getLevel ( ) {
        return Level;
    }

    public void setLevel ( int level ) {
        Level = level;
    }

    public int getFatherId ( ) {
        return fatherId;
    }

    public void setFatherId ( int fatherId ) {
        this.fatherId = fatherId;
    }

    public int getEnableLevelId ( ) {
        return enableLevelId;
    }

    public void setEnableLevelId ( int enableLevelId ) {
        this.enableLevelId = enableLevelId;
    }

    public String getDepartmentCode ( ) {
        return departmentCode;
    }

    public void setDepartmentCode ( String departmentCode ) {
        this.departmentCode = departmentCode;
    }

    public String getShortname ( ) {
        return shortname;
    }

    public void setShortname ( String shortname ) {
        this.shortname = shortname;
    }

    public String getFullname ( ) {
        return fullname;
    }

    public void setFullname ( String fullname ) {
        this.fullname = fullname;
    }

    public String getAddress ( ) {
        return address;
    }

    public void setAddress ( String address ) {
        this.address = address;
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
}
