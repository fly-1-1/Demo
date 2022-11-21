package com.example.demo.service;

import com.example.demo.domain.Student;
import com.example.demo.entity.PageResult;
import com.example.demo.entity.QueryPageBean;

import java.util.List;

/**
 * 服务接口
 */
public interface StudentService {

    public void add(Student student);

    public void deleteById(Integer id);

    public void edit(Student student);

    public Student findById(Integer id);

    public List<Student> findAll();

    public PageResult pageQuery(QueryPageBean queryPageBean);

}
