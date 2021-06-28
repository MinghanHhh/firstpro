package com.lmh.firstpro.pojo;

public class LoginMessage {
    private Integer userid;
    private String password;
    private Integer uclass;

    @Override
    public String toString() {
        return "LoginMessage{" +
                "userid=" + userid +
                ", password='" + password + '\'' +
                ", uclass=" + uclass +
                '}';
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUclass() {
        return uclass;
    }

    public void setUclass(Integer uclass) {
        this.uclass = uclass;
    }
}
