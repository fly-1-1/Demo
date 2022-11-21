package com.example.demo.service;

import com.example.demo.domain.Teacher;
import com.example.demo.entity.PageResult;
import com.example.demo.entity.QueryPageBean;

import java.util.List;

/**
 * 服务接口
 */
public interface TeacherService {

    public void add(Teacher teacher);
    
    public void deleteById(Integer id);
    
    public void edit(Teacher teacher);
    
    public Teacher findById(Integer id);
    
    public List<Teacher> findAll();

    public PageResult pageQuery(QueryPageBean queryPageBean);

}
