package cn.bdqn.entity;

public class TUser {
    /*
    * 1）ID
2）用户编码（自动生成） userCode
3）用户名称（）         name
4）密码					password
5）用户角色  （角色ID）  userrole
6）所属部门  （所属部门ID） department
7）联系电话   PHONE

8）部门表（也算组织结构表）department

*/
   private int id,userroleId,departmentId;
   private Long phone;
   private String   userCode,name,password;
   private Userrole userrole;
   private Department department;

    @Override
    public String toString ( ) {
        return "TUser{" +
                "id=" + id +
                ", userroleId=" + userroleId +
                ", departmentId=" + departmentId +
                ", phone=" + phone +
                ", userCode='" + userCode + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", userrole=" + userrole +
                ", department=" + department +
                '}';
    }

    public int getId ( ) {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public int getUserroleId ( ) {
        return userroleId;
    }

    public void setUserroleId ( int userroleId ) {
        this.userroleId = userroleId;
    }

    public int getDepartmentId ( ) {
        return departmentId;
    }

    public void setDepartmentId ( int departmentId ) {
        this.departmentId = departmentId;
    }

    public Long getPhone ( ) {
        return phone;
    }

    public void setPhone ( Long phone ) {
        this.phone = phone;
    }

    public String getUserCode ( ) {
        return userCode;
    }

    public void setUserCode ( String userCode ) {
        this.userCode = userCode;
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getPassword ( ) {
        return password;
    }

    public void setPassword ( String password ) {
        this.password = password;
    }

    public Userrole getUserrole ( ) {
        return userrole;
    }

    public void setUserrole ( Userrole userrole ) {
        this.userrole = userrole;
    }

    public Department getDepartment ( ) {
        return department;
    }

    public void setDepartment ( Department department ) {
        this.department = department;
    }

//qqqqqqqqq
}
