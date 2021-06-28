package com.lmh.firstpro.dao;

import com.lmh.firstpro.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherDao {

    Teacher getAllTeacher();

}
