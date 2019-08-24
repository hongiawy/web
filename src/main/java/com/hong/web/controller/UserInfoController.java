package com.hong.web.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserInfoController {


    @RequestMapping("/login")
    public Map login(){
        Map userInfoMap = new HashMap();
        userInfoMap.put("userName","张三");
        userInfoMap.put("userId","0001");
        return userInfoMap;
    }
}
