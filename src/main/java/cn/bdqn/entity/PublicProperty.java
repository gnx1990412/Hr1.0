package cn.bdqn.entity;

import java.util.Date;
//
//
// 公共属性表：
//         1）	id
//         2）	//启用级别表ID （对应启用级别id）： EnabelLevelID  做实体
//         3）//试题级别表ID： （对应试题级别表ID）examLevelID
//         2）属性代码：prpertyCode
//         3）描述：info
//         4）启用时间 startDate
//         5）失效时间：endDate
//         4)属性name:
//         3)对应的表




/**
 * Created by Shinelon on 2018/3/13.
 */
public class PublicProperty {
    private  int id;
    private  String code,name,info;
    private Date startDate,endDate;

    @Override
    public String toString ( ) {
        return "PublicProperty{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    public int getId ( ) {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
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

    public Date getStartDate ( ) {
        return startDate;
    }

    public void setStartDate ( Date startDate ) {
        this.startDate = startDate;
    }

    public Date getEndDate ( ) {
        return endDate;
    }

    public void setEndDate ( Date endDate ) {
        this.endDate = endDate;
    }
}
