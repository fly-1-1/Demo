package com.example.demo.service.impl;

import com.example.demo.domain.Student;
import com.example.demo.entity.PageResult;
import com.example.demo.entity.QueryPageBean;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.StudentService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("StudentService")
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public void add(Student student) {
        studentMapper.add(student);
    }

    @Override
    public void deleteById(Integer id) {
        studentMapper.deleteById(String.valueOf(id));
    }

    @Override
    public void edit(Student student) {
        studentMapper.edit(student);
    }

    @Override
    public Student findById(Integer id) {
        return studentMapper.findById(String.valueOf(id));
    }

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }

    @Override
    public PageResult pageQuery(QueryPageBean queryPageBean) {
        Integer currentPage = queryPageBean.getCurrentPage();
        String queryString = queryPageBean.getQueryString();
        Integer pageSize = queryPageBean.getPageSize();
        //完成分页查询 基于mybatis框架提供的分页助手插件完成
        PageHelper.startPage(currentPage, pageSize);

        Page<Student> page = studentMapper.selectByCondition(queryString);
        long total = page.getTotal();


        List<Student> rows = page.getResult();
        return new PageResult(total, rows);
    }
}
