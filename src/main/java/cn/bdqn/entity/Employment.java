package cn.bdqn.entity;

import java.util.Date;

/**
 * Created by Shinelon on 2018/3/13.
 */
public class Employment {
//录用表
//    idint(11) NOT NULL
//    interviewidint(11) NOT NULL
//    infotext NULL录用决议
//    datedate NOT NULL

    private int id,interviewId;
    private String info;
    private Date date;

    private  Interview interview;

    @Override
    public String toString ( ) {
        return "Employment{" +
                "id=" + id +
                ", interviewId=" + interviewId +
                ", info='" + info + '\'' +
                ", date=" + date +
                ", interview=" + interview +
                '}';
    }

    public int getId ( ) {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public int getInterviewId ( ) {
        return interviewId;
    }

    public void setInterviewId ( int interviewId ) {
        this.interviewId = interviewId;
    }

    public String getInfo ( ) {
        return info;
    }

    public void setInfo ( String info ) {
        this.info = info;
    }

    public Date getDate ( ) {
        return date;
    }

    public void setDate ( Date date ) {
        this.date = date;
    }

    public Interview getInterview ( ) {
        return interview;
    }

    public void setInterview ( Interview interview ) {
        this.interview = interview;
    }
}
