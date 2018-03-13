package cn.bdqn.entity;

/**
 * Created by Shinelon on 2018/3/13.
 */

//1）	ID
//        2）	级别： level  （int）
//        3）name：  level  （String）
//
//

public class EnableLevel {
   private int id,level,order;
  private   String code,name,info;

    @Override
    public String toString ( ) {
        return "EnableLevel{" +
                "id=" + id +
                ", level=" + level +
                ", order=" + order +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
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

    public int getOrder ( ) {
        return order;
    }

    public void setOrder ( int order ) {
        this.order = order;
    }

    public String getCode ( ) {
        return code;
    }

    public void setCode ( String code ) {
        this.code = code;
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
}
