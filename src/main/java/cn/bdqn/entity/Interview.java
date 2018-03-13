package cn.bdqn.entity;

import java.util.Date;

/**
 * Created by Shinelon on 2018/3/13.
 */
public class Interview {
    //雇佣表
//    idint(11) NOT NULL
//    cvIDint(11) NOT NULL简历ID
//    firstdatedate NULL
//    firstpeoplevarchar(40) NULL
//    firstinfotext NULL
//    secounddatedate NULL
//    secoundpeoplevarchar(40) NULL
//    secoundinfotext NULL
//    thirddatedate NULL
//    thirdpeoplevarchar(40) NULL
//    thirdinfotext NULL


    private int id,cvID;
    private   String  firstpeople,firstinfo,secoundpeopl,secoundinfo,thirdpeople,thirdinfo;
    private Date firstdatedate ,secounddatedate,thirddatedate;
    private Curriculumvitae curriculumvitae;

    @Override
    public String toString ( ) {
        return "Recruit{" +
                "id=" + id +
                ", cvID=" + cvID +
                ", firstpeople='" + firstpeople + '\'' +
                ", firstinfo='" + firstinfo + '\'' +
                ", secoundpeopl='" + secoundpeopl + '\'' +
                ", secoundinfo='" + secoundinfo + '\'' +
                ", thirdpeople='" + thirdpeople + '\'' +
                ", thirdinfo='" + thirdinfo + '\'' +
                ", firstdatedate=" + firstdatedate +
                ", secounddatedate=" + secounddatedate +
                ", thirddatedate=" + thirddatedate +
                ", curriculumvitae=" + curriculumvitae +
                '}';
    }

    public int getId ( ) {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public int getCvID ( ) {
        return cvID;
    }

    public void setCvID ( int cvID ) {
        this.cvID = cvID;
    }

    public String getFirstpeople ( ) {
        return firstpeople;
    }

    public void setFirstpeople ( String firstpeople ) {
        this.firstpeople = firstpeople;
    }

    public String getFirstinfo ( ) {
        return firstinfo;
    }

    public void setFirstinfo ( String firstinfo ) {
        this.firstinfo = firstinfo;
    }

    public String getSecoundpeopl ( ) {
        return secoundpeopl;
    }

    public void setSecoundpeopl ( String secoundpeopl ) {
        this.secoundpeopl = secoundpeopl;
    }

    public String getSecoundinfo ( ) {
        return secoundinfo;
    }

    public void setSecoundinfo ( String secoundinfo ) {
        this.secoundinfo = secoundinfo;
    }

    public String getThirdpeople ( ) {
        return thirdpeople;
    }

    public void setThirdpeople ( String thirdpeople ) {
        this.thirdpeople = thirdpeople;
    }

    public String getThirdinfo ( ) {
        return thirdinfo;
    }

    public void setThirdinfo ( String thirdinfo ) {
        this.thirdinfo = thirdinfo;
    }

    public Date getFirstdatedate ( ) {
        return firstdatedate;
    }

    public void setFirstdatedate ( Date firstdatedate ) {
        this.firstdatedate = firstdatedate;
    }

    public Date getSecounddatedate ( ) {
        return secounddatedate;
    }

    public void setSecounddatedate ( Date secounddatedate ) {
        this.secounddatedate = secounddatedate;
    }

    public Date getThirddatedate ( ) {
        return thirddatedate;
    }

    public void setThirddatedate ( Date thirddatedate ) {
        this.thirddatedate = thirddatedate;
    }

    public Curriculumvitae getCurriculumvitae ( ) {
        return curriculumvitae;
    }

    public void setCurriculumvitae ( Curriculumvitae curriculumvitae ) {
        this.curriculumvitae = curriculumvitae;
    }
}
