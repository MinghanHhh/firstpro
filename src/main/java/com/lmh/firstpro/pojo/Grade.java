package com.lmh.firstpro.pojo;

import java.util.Date;

public class Grade {

    private Integer pk_gradeid;
    private Integer student_id;
    private Integer course_id;
    private Integer grade;
    private Date create_time;
    private Date modify_time;

    @Override
    public String toString() {
        return "Grade{" +
                "pk_gradeid=" + pk_gradeid +
                ", student_id=" + student_id +
                ", course_id=" + course_id +
                ", grade=" + grade +
                ", create_time=" + create_time +
                ", modify_time=" + modify_time +
                '}';
    }

    public Integer getPk_gradeid() {
        return pk_gradeid;
    }

    public void setPk_gradeid(Integer pk_gradeid) {
        this.pk_gradeid = pk_gradeid;
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

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
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
