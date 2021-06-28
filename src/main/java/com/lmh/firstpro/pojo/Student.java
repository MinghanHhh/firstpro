package com.lmh.firstpro.pojo;

import java.util.Date;

public class Student {

    private Integer pk_studentid;
    private String student_name;
    private String student_password;
    private Integer student_instituteid;
    private Date create_time;
    private Date modify_time;

    @Override
    public String toString() {
        return "Student{" +
                "pk_studentid=" + pk_studentid +
                ", student_name='" + student_name + '\'' +
                ", student_password='" + student_password + '\'' +
                ", student_instituteid=" + student_instituteid +
                ", create_time=" + create_time +
                ", modify_time=" + modify_time +
                '}';
    }

    public Integer getPk_studentid() {
        return pk_studentid;
    }

    public void setPk_studentid(Integer pk_studentid) {
        this.pk_studentid = pk_studentid;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_password() {
        return student_password;
    }

    public void setStudent_password(String student_password) {
        this.student_password = student_password;
    }

    public Integer getStudent_instituteid() {
        return student_instituteid;
    }

    public void setStudent_instituteid(Integer student_instituteid) {
        this.student_instituteid = student_instituteid;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getModify_time() {
        return modify_time;
    }

    public void setModify_time(Date modify_time) {
        this.modify_time = modify_time;
    }
}
