package com.sample.Student.controller;

import com.sample.Student.entity.Students;
import com.sample.Student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;
    @RequestMapping("/create")
    public Students create(HttpServletRequest request){
        String name=request.getParameter("name");
        String phone=request.getParameter("phone");
        Students student=new Students(name,"CSE",8.5f,22,phone);
        return service.save(student);
    }
    @RequestMapping("/list")
    public List<Students> List(){
        return service.listAll();
    }
}
