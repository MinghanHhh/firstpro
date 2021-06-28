package com.lmh.firstpro.pojo;

import java.util.Date;

public class Admin {

    private Integer pk_adminid;
    private String admin_name;
    private String admin_pwd;
    private Integer admin_institudeid;

    public Integer getPk_adminid() {
        return pk_adminid;
    }

    public void setPk_adminid(Integer pk_adminid) {
        this.pk_adminid = pk_adminid;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getAdmin_pwd() {
        return admin_pwd;
    }

    public void setAdmin_pwd(String admin_pwd) {
        this.admin_pwd = admin_pwd;
    }

    public Integer getAdmin_institudeid() {
        return admin_institudeid;
    }

    public void setAdmin_institudeid(Integer admin_institudeid) {
        this.admin_institudeid = admin_institudeid;
    }
}
