package com.lmh.firstpro.dao;

import com.lmh.firstpro.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
//@Repository
public interface AdminDao {

    Admin getAdminMessage(Integer adminid, String password);



}
