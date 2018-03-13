package cn.bdqn.entity;

public class ExamLevel {
    /*
    *
    *
         试题级别：examLevel
        1）id
        2）name
        3）级别：level

    *
    * */
    private int id,level,order;
    private String name,info,namecode;

    @Override
    public String toString ( ) {
        return "ExamLevel{" +
                "id=" + id +
                ", level=" + level +
                ", order=" + order +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", namecode='" + namecode + '\'' +
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

    public String getNamecode ( ) {
        return namecode;
    }

    public void setNamecode ( String namecode ) {
        this.namecode = namecode;
    }
}

