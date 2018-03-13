package cn.bdqn.entity;

/**
 * Created by samsung on 2018/3/13.
 */
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
    private int id  , departmentid , PHONE ;
    private String name , password , userrole , department ;

    public TUser() {
    }

    public TUser(int id, int departmentid, int PHONE, String name, String password, String userrole, String department) {
        this.id = id;
        this.departmentid = departmentid;
        this.PHONE = PHONE;
        this.name = name;
        this.password = password;
        this.userrole = userrole;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public int getDepartmentid() {
        return departmentid;
    }

    public int getPHONE() {
        return PHONE;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getUserrole() {
        return userrole;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "TUser{" +
                "id=" + id +
                ", departmentid=" + departmentid +
                ", PHONE=" + PHONE +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", userrole='" + userrole + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

}
