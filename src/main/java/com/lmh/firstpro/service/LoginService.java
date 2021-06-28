package com.lmh.firstpro.service;

import com.lmh.firstpro.dao.AdminDao;
import com.lmh.firstpro.dao.TeacherDao;
import com.lmh.firstpro.pojo.Admin;
import com.lmh.firstpro.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSON;

import javax.annotation.Resource;
import java.util.HashMap;

@Service
public class LoginService {

    @Resource
    private AdminDao adminDao;

//    @Autowired
//    private TeacherDao teacherDao;

    public String login(Integer adminid, String password, Integer uclass) {
        Integer status;
        if (uclass == 1) {
            // 管理员 admin表
            Admin adminMessage = adminDao.getAdminMessage(adminid, password);
            System.out.println(adminMessage);

            if (adminMessage.equals(null)) {
                status = 201;
            } else {
                status = 200;
            }

            // 将结果装入一个hashmap中
            HashMap<String, Object> res = new HashMap<>();
            res.put("admin", adminMessage);
            res.put("status", status);
            // 将对象转换为JSON串返回
            String res_json = JSON.toJSONString(res);

            return res_json;

        } else if (uclass == 2) {
            // 教师 teacher表
//            Teacher allTeacher = teacherDao.getAllTeacher();
//            System.out.println(allTeacher);
        } else {
            // 学生 student表
        }

        return "login";

    }
}
