package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author : liuxulong
 * date : 10:43 2019/4/17
 */
@Controller
public class HelloController {
    /**
     * 1、使用RequestMapping注解来映射请求的URL
     * 2、返回值会通过视图解析器解析为实际的物理视图，对于InternalResourceViewResolver而言，
     * 视图解析器会做如下的解析：
     * 2.1、通过prefix + returnVal + 后缀这样的方式得到实际的物理视图，然后做转发操作。
     * 	如：/WEB-INF/views/success.jsp
     * @return
     */
    @RequestMapping("/helloword")
    public String helloWorld(Model model){
        model.addAttribute("helloMsg","很高兴认识你");
        return "hello";
    }
}
