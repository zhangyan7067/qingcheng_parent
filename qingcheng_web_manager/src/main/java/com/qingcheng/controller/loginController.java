package com.qingcheng.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangyan
 * @version 1.0
 * @date 2019/7/17 15:57
 */
@RestController
@RequestMapping("/login")
public class loginController {
    @SuppressWarnings("unchecked")
    @GetMapping("/getname")
    public Map getname(){
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        Map map =new HashMap<String,String>();
        map.put("name",name);
        return map;

    }
}
