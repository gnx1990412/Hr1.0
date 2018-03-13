package cn.bdqn.entity;

/**
 职位分类表ID：（与职位表一对一关系，为了提高搜索效率和存储逻辑单独设表）
 1）ID
 2）职位分类名称 ：name


 * Created by Administrator on 2018/3/13.
 */
public class JobType {
  private int id;
  private String name;

    @Override
    public String toString ( ) {
        return "JobType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId ( ) {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }
}
