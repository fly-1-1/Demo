package com.example.demo.controller;

import com.example.demo.constant.MessageConstant;
import com.example.demo.domain.Teacher;
import com.example.demo.entity.PageResult;
import com.example.demo.entity.QueryPageBean;
import com.example.demo.entity.Result;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;


    @RequestMapping("/add")
    public Result add(@RequestBody Teacher teacher) {
        try {
            teacherService.add(teacher);
        } catch (Exception e) {
            e.printStackTrace();
            //服务调用失败
            return new Result(false, MessageConstant.ADD_FAIL);
        }
        return new Result(true, MessageConstant.ADD_SUCCESS);
    }


    @RequestMapping("/findPage")
    public PageResult findPage(@RequestBody QueryPageBean queryPageBean) {

        PageResult pageResult = teacherService.pageQuery(queryPageBean);
        return pageResult;
    }

    @RequestMapping("/delete")
    public Result delete(Integer t_id) {
        try {
            teacherService.deleteById(t_id);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, MessageConstant.DELETE_FAIL);
        }
        return new Result(true, MessageConstant.DELETE_SUCCESS);
    }

    @RequestMapping("/findAll")
    public Result findAll() {
        try {
            List<Teacher> list = teacherService.findAll();
            return new Result(true, MessageConstant.QUERY_SUCCESS,list);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, MessageConstant.QUERY_FAIL);
        }
    }


    @RequestMapping("/edit")
    public Result edit(@RequestBody Teacher s_teacher) {
        try {
            teacherService.edit(s_teacher);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, MessageConstant.EDIT_FAIL);
        }
        return new Result(true, MessageConstant.EDIT_SUCCESS);
    }

    @RequestMapping("/findById")
    public Result findById(Integer s_id) {
        try {
            Teacher teacher = teacherService.findById(s_id);
            System.out.println(teacher);
            return new Result(true, MessageConstant.QUERY_SUCCESS,teacher);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, MessageConstant.QUERY_FAIL);
        }
    }
}
