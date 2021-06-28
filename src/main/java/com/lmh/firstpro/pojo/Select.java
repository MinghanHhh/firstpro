package com.lmh.firstpro.pojo;

import java.util.Date;

public class Select {

    private Integer pk_id;
    private Integer student_id;
    private Integer course_id;
    private String course_selected;
    private Date create_time;
    private Date modify_time;

    @Override
    public String toString() {
        return "Select{" +
                "pk_id=" + pk_id +
                ", student_id=" + student_id +
                ", course_id=" + course_id +
                ", course_selected='" + course_selected + '\'' +
                ", create_time=" + create_time +
                ", modify_time=" + modify_time +
                '}';
    }

    public Integer getPk_id() {
        return pk_id;
    }

    public void setPk_id(Integer pk_id) {
        this.pk_id = pk_id;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    public String getCourse_selected() {
        return course_selected;
    }

    public void setCourse_selected(String course_selected) {
        this.course_selected = course_selected;
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
