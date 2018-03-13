package cn.bdqn.entity;

import java.util.Date;
import java.util.List;


public class Exam {
    //这张表是考试信息表，该表用COLLECTION,
    //主要是包含多个试题表，用LIst

    private int id,departmentID,appendixId,enableLevelId;
    private String name,people,info,Remarks;
    private Date date;
    private Department department;
    private List<Appendix> appendixList;

    @Override
    public String toString ( ) {
        return "Exam{" +
                "id=" + id +
                ", departmentID=" + departmentID +
                ", appendixId=" + appendixId +
                ", enableLevelId=" + enableLevelId +
                ", name='" + name + '\'' +
                ", people='" + people + '\'' +
                ", info='" + info + '\'' +
                ", Remarks='" + Remarks + '\'' +
                ", date=" + date +
                ", department=" + department +
                ", appendixList=" + appendixList +
                '}';
    }

    public int getId ( ) {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public int getDepartmentID ( ) {
        return departmentID;
    }

    public void setDepartmentID ( int departmentID ) {
        this.departmentID = departmentID;
    }

    public int getAppendixId ( ) {
        return appendixId;
    }

    public void setAppendixId ( int appendixId ) {
        this.appendixId = appendixId;
    }

    public int getEnableLevelId ( ) {
        return enableLevelId;
    }

    public void setEnableLevelId ( int enableLevelId ) {
        this.enableLevelId = enableLevelId;
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getPeople ( ) {
        return people;
    }

    public void setPeople ( String people ) {
        this.people = people;
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

    public Date getDate ( ) {
        return date;
    }

    public void setDate ( Date date ) {
        this.date = date;
    }

    public Department getDepartment ( ) {
        return department;
    }

    public void setDepartment ( Department department ) {
        this.department = department;
    }

    public List <Appendix> getAppendixList ( ) {
        return appendixList;
    }

    public void setAppendixList ( List <Appendix> appendixList ) {
        this.appendixList = appendixList;
    }
}
