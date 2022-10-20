package me.yifeiyuan.hf.spring.boot;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {

    @RequestMapping("hello")
    public String hello(Model model) {
        model.addAttribute("msg", "hello, Thymeleaf");
        model.addAttribute("name", "程序亦非猿");
        return "helloworld"; //返回 template 的名字? 根据返回值查找 html 资源
//        return "world";
    }

}
