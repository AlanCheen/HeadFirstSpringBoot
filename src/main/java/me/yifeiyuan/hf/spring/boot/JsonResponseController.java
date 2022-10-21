package me.yifeiyuan.hf.spring.boot;


import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//返回 json 结构数据的
@RestController
public class JsonResponseController {

    @RequestMapping(path = "/json/map")
    public Map mapResult() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "程序亦非猿");
        hashMap.put("age", "18");
        return hashMap;
    }

    @RequestMapping("/json/list")
    public List listResult() {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Kotlin");
        return list;
    }

    @RequestMapping("/json/listObject")
    public List<Student> listObjectResult() {
        List<Student> list = new ArrayList<>();
        Student student = new Student();
        student.name = "Student A";
        student.age = 22;
        list.add(student);

        Student student2 = new Student();
        student2.name = "Student B";
        student2.age = 11;
        list.add(student2);

        return list;
    }

    @ResponseBody
    @GetMapping("/json/object")
    public Student objectResult() {
        Student student = new Student();
        student.name = "Student A";
        student.age = 22;
        return student;
    }

    @Data
    static class Student implements Serializable {
         String name;
      int age;
    }
}
