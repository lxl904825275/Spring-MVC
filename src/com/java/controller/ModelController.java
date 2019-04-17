package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author : liuxulong
 * date : 10:43 2019/4/17
 */
@Controller
@RequestMapping("model")
public class ModelController {
    /**
     * 1、使用RequestMapping注解来映射请求的URL
     * 2、返回值会通过视图解析器解析为实际的物理视图，对于InternalResourceViewResolver而言，
     * 视图解析器会做如下的解析：
     * 2.1、通过prefix + returnVal + 后缀这样的方式得到实际的物理视图，然后做转发操作。
     * 如：/WEB-INF/views/success.jsp
     *
     * @return
     */
    @RequestMapping("/query")
    public ModelAndView queryModel() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "欢饮来到德莱联盟midel");
        modelAndView.setViewName("model");
        return modelAndView;
    }

    @RequestMapping(value = "/testParamaAndHeaders",params = {"username","age!=10"})
    public  String testParamaAndHeaders(@RequestParam(name = "username") String username){
        System.out.println("testParamaAndHeaders");
        System.out.println("username======"+username);
        return "success";
    }
    @RequestMapping(value = "testParama")
    public String testParama(@RequestParam(name = "username") String username){
        System.out.println("testParamaAndHeaders");
        System.out.println("username======"+username);
        return "success";
    }

    /**
     * Ant风格资源地址支持三种匹配符
     * ？：匹配文件名中的一个字符
     * * ：匹配文件名中任意字符
     * **：**匹配多层路径
     * @return
     */
  @RequestMapping(value = "testAnt/**/abc")
    public String testAnt(){
      System.out.println("testAntPath");
      return "success";
  }
}