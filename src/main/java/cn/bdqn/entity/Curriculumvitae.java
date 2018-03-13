package cn.bdqn.entity;

import java.util.Date;

/**
 * Created by Shinelon on 2018/3/13.
 */
public class Curriculumvitae {

    //简历表

//    FieldTypeComment
//    IDint(11) NOT NULL
//    recruitIdint(11) NOT NULL招聘ID
//    namevarchar(40) NOT NULL
//    genderint(1) NOT NULL1男2女3...
//    Emailvarchar(100) NULL
//    phoneint(11) NOT NULL
//    AccountAddressvarchar(100) NULL户口地址
//    Addressvarchar(100) NULL住址
//    partyint(1) NOT NULL先设置成1群众2党员
//    cardNovarchar(18) NOT NULL尾数有可能X
//    schoolvarchar(50) NOT NULL
//    Educationint(1) NOT NULL学历
//    majorvarchar(20) NOT NULL专业
//    experiencefloat NOT NULL经验
//    salarydecimal(10,2) NULL薪水
//    freeint(1) NOT NULL1在职2非在职
//    atSchoolint(1) NOT NULL1应届2,非应届
//    timedate NOT NULL  收到简历的日期
//    Personalresumetext NOT NULL个人履历
//    otherIDint(11) NULL附件ID
//    stateint(1) NOT NULL1存档，2推荐免试，3面，4 2面，5 3面，6 建议录用，7 删除

    private int id,recruitId,gender,phone,party,education,free,atSchool,otherID,state;
    private String name,email,accountAddress,Address, cardNo,school,major,Personalresume;
    private float experience,salary;
    private Date timeDate;

    private Recruit recruit;
    private Appendix appendix;

    @Override
    public String toString ( ) {
        return "Curriculumvitae{" +
                "id=" + id +
                ", recruitId=" + recruitId +
                ", gender=" + gender +
                ", phone=" + phone +
                ", party=" + party +
                ", education=" + education +
                ", free=" + free +
                ", atSchool=" + atSchool +
                ", otherID=" + otherID +
                ", state=" + state +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", accountAddress='" + accountAddress + '\'' +
                ", Address='" + Address + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", school='" + school + '\'' +
                ", major='" + major + '\'' +
                ", Personalresume='" + Personalresume + '\'' +
                ", experience=" + experience +
                ", salary=" + salary +
                ", timeDate=" + timeDate +
                ", recruit=" + recruit +
                ", appendix=" + appendix +
                '}';
    }

    public int getId ( ) {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public int getRecruitId ( ) {
        return recruitId;
    }

    public void setRecruitId ( int recruitId ) {
        this.recruitId = recruitId;
    }

    public int getGender ( ) {
        return gender;
    }

    public void setGender ( int gender ) {
        this.gender = gender;
    }

    public int getPhone ( ) {
        return phone;
    }

    public void setPhone ( int phone ) {
        this.phone = phone;
    }

    public int getParty ( ) {
        return party;
    }

    public void setParty ( int party ) {
        this.party = party;
    }

    public int getEducation ( ) {
        return education;
    }

    public void setEducation ( int education ) {
        this.education = education;
    }

    public int getFree ( ) {
        return free;
    }

    public void setFree ( int free ) {
        this.free = free;
    }

    public int getAtSchool ( ) {
        return atSchool;
    }

    public void setAtSchool ( int atSchool ) {
        this.atSchool = atSchool;
    }

    public int getOtherID ( ) {
        return otherID;
    }

    public void setOtherID ( int otherID ) {
        this.otherID = otherID;
    }

    public int getState ( ) {
        return state;
    }

    public void setState ( int state ) {
        this.state = state;
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getEmail ( ) {
        return email;
    }

    public void setEmail ( String email ) {
        this.email = email;
    }

    public String getAccountAddress ( ) {
        return accountAddress;
    }

    public void setAccountAddress ( String accountAddress ) {
        this.accountAddress = accountAddress;
    }

    public String getAddress ( ) {
        return Address;
    }

    public void setAddress ( String address ) {
        Address = address;
    }

    public String getCardNo ( ) {
        return cardNo;
    }

    public void setCardNo ( String cardNo ) {
        this.cardNo = cardNo;
    }

    public String getSchool ( ) {
        return school;
    }

    public void setSchool ( String school ) {
        this.school = school;
    }

    public String getMajor ( ) {
        return major;
    }

    public void setMajor ( String major ) {
        this.major = major;
    }

    public String getPersonalresume ( ) {
        return Personalresume;
    }

    public void setPersonalresume ( String personalresume ) {
        Personalresume = personalresume;
    }

    public float getExperience ( ) {
        return experience;
    }

    public void setExperience ( float experience ) {
        this.experience = experience;
    }

    public float getSalary ( ) {
        return salary;
    }

    public void setSalary ( float salary ) {
        this.salary = salary;
    }

    public Date getTimeDate ( ) {
        return timeDate;
    }

    public void setTimeDate ( Date timeDate ) {
        this.timeDate = timeDate;
    }

    public Recruit getRecruit ( ) {
        return recruit;
    }

    public void setRecruit ( Recruit recruit ) {
        this.recruit = recruit;
    }

    public Appendix getAppendix ( ) {
        return appendix;
    }

    public void setAppendix ( Appendix appendix ) {
        this.appendix = appendix;
    }
}
