package com.blog.controller;

import com.blog.service.UService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @Autowired
    private UService uService;
    @RequestMapping("/test")
    public String test(){
        return "test";
    }

    @RequestMapping("/getAllUser")
    public String getAllUser(){
        return uService.getAllUser().toString();
    }

    @RequestMapping("/getUserByIndex")
    public String getUserByIndex(@Param("index") int index){
        return uService.getUserByIndex(index).toString();
    }
}
