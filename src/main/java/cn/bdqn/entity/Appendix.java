package cn.bdqn.entity;

/**
 * Created by Shinelon on 2018/3/13.
 */
public class Appendix {
    //附件管理表
    int id,state;
    String url,stateString;

    @Override
    public String toString ( ) {
        return "Appendix{" +
                "id=" + id +
                ", state=" + state +
                ", url='" + url + '\'' +
                ", stateString='" + stateString + '\'' +
                '}';
    }

    public int getId ( ) {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public int getState ( ) {
        return state;
    }

    public void setState ( int state ) {
        this.state = state;


    }

    public String getUrl ( ) {
        return url;
    }

    public void setUrl ( String url ) {
        this.url = url;
    }

    public String getStateString ( ) {
        return stateString;
    }

    public void setStateString ( String stateString ) {
        this.stateString = stateString;
    }
}
