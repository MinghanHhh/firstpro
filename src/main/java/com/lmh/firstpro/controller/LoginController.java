package com.lmh.firstpro.controller;

import com.lmh.firstpro.pojo.LoginMessage;
import com.lmh.firstpro.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LoginController {

    @Resource
    private LoginService loginService;

    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(@RequestBody LoginMessage loginMessage) {
        System.out.println(loginMessage);
        String loginResult = loginService.login(loginMessage.getUserid(), loginMessage.getPassword(), loginMessage.getUclass());
        return loginResult;
    }

}
