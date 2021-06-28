package com.lmh.firstpro.pojo;

import java.util.Date;

public class Course {

    private Integer pk_courseid;
    private String course_instituteid;
    private String course_name;
    private String course_intro;
    private Integer course_before;
    private String course_info;
    private Integer course_capacity;
    private Integer course_current;
    private Integer course_confirm;
    private Date create_time;
    private Date modify_time;

    @Override
    public String toString() {
        return "Course{" +
                "pk_courseid=" + pk_courseid +
                ", course_instituteid='" + course_instituteid + '\'' +
                ", course_name='" + course_name + '\'' +
                ", course_intro='" + course_intro + '\'' +
                ", course_before=" + course_before +
                ", course_info='" + course_info + '\'' +
                ", course_capacity=" + course_capacity +
                ", course_current=" + course_current +
                ", course_confirm=" + course_confirm +
                ", create_time=" + create_time +
                ", modify_time=" + modify_time +
                '}';
    }

    public Integer getPk_courseid() {
        return pk_courseid;
    }

    public void setPk_courseid(Integer pk_courseid) {
        this.pk_courseid = pk_courseid;
    }

    public String getCourse_instituteid() {
        return course_instituteid;
    }

    public void setCourse_instituteid(String course_instituteid) {
        this.course_instituteid = course_instituteid;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_intro() {
        return course_intro;
    }

    public void setCourse_intro(String course_intro) {
        this.course_intro = course_intro;
    }

    public Integer getCourse_before() {
        return course_before;
    }

    public void setCourse_before(Integer course_before) {
        this.course_before = course_before;
    }

    public String getCourse_info() {
        return course_info;
    }

    public void setCourse_info(String course_info) {
        this.course_info = course_info;
    }

    public Integer getCourse_capacity() {
        return course_capacity;
    }

    public void setCourse_capacity(Integer course_capacity) {
        this.course_capacity = course_capacity;
    }

    public Integer getCourse_current() {
        return course_current;
    }

    public void setCourse_current(Integer course_current) {
        this.course_current = course_current;
    }

    public Integer getCourse_confirm() {
        return course_confirm;
    }

    public void setCourse_confirm(Integer course_confirm) {
        this.course_confirm = course_confirm;
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
