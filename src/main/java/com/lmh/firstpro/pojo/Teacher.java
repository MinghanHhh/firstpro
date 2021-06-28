package com.lmh.firstpro.pojo;

import java.util.Date;

public class Teacher {
    private Integer pk_teacherid;
    private String teacher_name;
    private String teacher_pwd;
    private Integer teacher_institudeid;
    private Date create_time;
    private Date modify_time;

    @Override
    public String toString() {
        return "Teacher{" +
                "pk_teacherid=" + pk_teacherid +
                ", teacher_name='" + teacher_name + '\'' +
                ", teacher_pwd='" + teacher_pwd + '\'' +
                ", teacher_institudeid=" + teacher_institudeid +
                ", create_time=" + create_time +
                ", modify_time=" + modify_time +
                '}';
    }

    public Integer getPk_teacherid() {
        return pk_teacherid;
    }

    public void setPk_teacherid(Integer pk_teacherid) {
        this.pk_teacherid = pk_teacherid;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getTeacher_pwd() {
        return teacher_pwd;
    }

    public void setTeacher_pwd(String teacher_pwd) {
        this.teacher_pwd = teacher_pwd;
    }

    public Integer getTeacher_institudeid() {
        return teacher_institudeid;
    }

    public void setTeacher_institudeid(Integer teacher_institudeid) {
        this.teacher_institudeid = teacher_institudeid;
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
