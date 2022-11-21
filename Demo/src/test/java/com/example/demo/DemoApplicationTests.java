package com.example.demo;


import com.example.demo.entity.PageResult;
import com.example.demo.entity.QueryPageBean;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.mapper.TeacherMapper;
import com.example.demo.service.StudentService;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {




    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private TeacherMapper teacherMapper;


    @Autowired
    private StudentService studentService;


    @Test
    void contextLoads() {

        QueryPageBean queryPageBean=new QueryPageBean();
        queryPageBean.setCurrentPage(1);
        queryPageBean.setPageSize(2);

        PageResult pageResult = studentService.pageQuery(queryPageBean);

        List rows = pageResult.getRows();
        Long total = pageResult.getTotal();

        System.out.println(total);


    }

}
