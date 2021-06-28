package com.lmh.firstpro.pojo;

import java.util.Date;

public class Institude {

    private Integer pk_instituteid;
    private String institute_name;
    private Date create_time;
    private Date modify_time;

    @Override
    public String toString() {
        return "Institude{" +
                "pk_instituteid=" + pk_instituteid +
                ", institute_name='" + institute_name + '\'' +
                ", create_time=" + create_time +
                ", modify_time=" + modify_time +
                '}';
    }

    public Integer getPk_instituteid() {
        return pk_instituteid;
    }

    public void setPk_instituteid(Integer pk_instituteid) {
        this.pk_instituteid = pk_instituteid;
    }

    public String getInstitute_name() {
        return institute_name;
    }

    public void setInstitute_name(String institute_name) {
        this.institute_name = institute_name;
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
