package cn.bdqn.entity;

import java.util.Date;

/**
 * Created by Shinelon on 2018/3/13.
 */
public class Recruit {
//招聘信息表

//    FieldTypeComment
//    idint(11) NOT NULL
//    positionNamevarchar(30) NOT NULL
//    positionTypeint(1) NOT NULL1为校招，2为社招
//    departmentint(2) NOT NULL部门ID
//    positionClassint(2) NOT NULL职位类型ID
//    numint(4) NOT NULL招聘数量
//    startDatedate NOT NULL开始日期
//    endDatedate NULL结束日期
//    contenttext NOT NULL职位描述
//    Requirementtext NOT NULL需求
//    Registrarvarchar(30) NOT NULL登记员

    private int id,departmentint,positionClass,num,positionTypei;
    private String  positionName,content,Requirement,Registrar;
    private Date  endDate,startDate;

    @Override
    public String toString ( ) {
        return "Recruit{" +
                "id=" + id +
                ", departmentint=" + departmentint +
                ", positionClass=" + positionClass +
                ", num=" + num +
                ", positionTypei=" + positionTypei +
                ", positionName='" + positionName + '\'' +
                ", content='" + content + '\'' +
                ", Requirement='" + Requirement + '\'' +
                ", Registrar='" + Registrar + '\'' +
                ", endDate=" + endDate +
                ", startDate=" + startDate +
                '}';
    }

    public int getId ( ) {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public int getDepartmentint ( ) {
        return departmentint;
    }

    public void setDepartmentint ( int departmentint ) {
        this.departmentint = departmentint;
    }

    public int getPositionClass ( ) {
        return positionClass;
    }

    public void setPositionClass ( int positionClass ) {
        this.positionClass = positionClass;
    }

    public int getNum ( ) {
        return num;
    }

    public void setNum ( int num ) {
        this.num = num;
    }

    public int getPositionTypei ( ) {
        return positionTypei;
    }

    public void setPositionTypei ( int positionTypei ) {
        this.positionTypei = positionTypei;
    }

    public String getPositionName ( ) {
        return positionName;
    }

    public void setPositionName ( String positionName ) {
        this.positionName = positionName;
    }

    public String getContent ( ) {
        return content;
    }

    public void setContent ( String content ) {
        this.content = content;
    }

    public String getRequirement ( ) {
        return Requirement;
    }

    public void setRequirement ( String requirement ) {
        Requirement = requirement;
    }

    public String getRegistrar ( ) {
        return Registrar;
    }

    public void setRegistrar ( String registrar ) {
        Registrar = registrar;
    }

    public Date getEndDate ( ) {
        return endDate;
    }

    public void setEndDate ( Date endDate ) {
        this.endDate = endDate;
    }

    public Date getStartDate ( ) {
        return startDate;
    }

    public void setStartDate ( Date startDate ) {
        this.startDate = startDate;
    }
}
