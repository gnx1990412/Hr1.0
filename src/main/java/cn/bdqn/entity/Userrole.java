package cn.bdqn.entity;

/**
 * Created by Shinelon on 2018/3/13.
 */
public class Userrole {

//    1）	ID
//2）	角色名称：
//            3）	用户级别 ：  Level



    private int id,level;
    private String name;

    @Override
    public String toString ( ) {
        return "Userrole{" +
                "id=" + id +
                ", level=" + level +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId ( ) {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public int getLevel ( ) {
        return level;
    }

    public void setLevel ( int level ) {
        this.level = level;
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }
}
