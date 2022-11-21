package com.example.demo.controller;

import com.example.demo.constant.MessageConstant;
import com.example.demo.domain.Student;
import com.example.demo.entity.PageResult;
import com.example.demo.entity.QueryPageBean;
import com.example.demo.entity.Result;
import com.example.demo.service.StudentService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {



    @Autowired
    private StudentService studentService;


    @RequestMapping("/add")
    public Result add(@RequestBody Student student) {
        try {
            studentService.add(student);
        } catch (Exception e) {
            e.printStackTrace();
            //服务调用失败
            return new Result(false, MessageConstant.ADD_FAIL);
        }
        return new Result(true, MessageConstant.ADD_SUCCESS);
    }


    @RequestMapping("/findPage")
    public PageResult findPage(@RequestBody QueryPageBean queryPageBean) {

        PageResult pageResult = studentService.pageQuery(queryPageBean);
        return pageResult;
    }

    @RequestMapping("/delete")
    public Result delete(Integer s_id) {
        try {
            studentService.deleteById(s_id);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, MessageConstant.DELETE_FAIL);
        }
        return new Result(true, MessageConstant.DELETE_SUCCESS);
    }

    @RequestMapping("/findAll")
    public Result findAll() {
        try {
            List<Student> list = studentService.findAll();
            return new Result(true, MessageConstant.QUERY_SUCCESS,list);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, MessageConstant.QUERY_FAIL);
        }
    }


    @RequestMapping("/edit")
    public Result edit(@RequestBody Student s_student) {
        try {
            studentService.edit(s_student);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, MessageConstant.EDIT_FAIL);
        }
        return new Result(true, MessageConstant.EDIT_SUCCESS);
    }

    @RequestMapping("/findById")
    public Result findById(Integer s_id) {
        try {
            Student student = studentService.findById(s_id);
            System.out.println(student);
            return new Result(true, MessageConstant.QUERY_SUCCESS,student);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, MessageConstant.QUERY_FAIL);
        }
    }
}
