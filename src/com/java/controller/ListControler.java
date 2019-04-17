package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : liuxulong
 * date : 14:09 2019/4/17
 */
@Controller
@RequestMapping("/list")
public class ListControler {
    @RequestMapping("/toadd")
    public String  toAdd(){
        System.out.println("toAdd......");
        return  "add";
    }
    @RequestMapping("/add")
    public String  toAdd( User user){
        System.out.println("add......"+user);
        return  "add";
    }
}
