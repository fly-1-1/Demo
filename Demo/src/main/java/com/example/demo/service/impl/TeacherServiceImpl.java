package com.example.demo.service.impl;

import com.example.demo.domain.Teacher;
import com.example.demo.entity.PageResult;
import com.example.demo.entity.QueryPageBean;
import com.example.demo.mapper.TeacherMapper;
import com.example.demo.service.TeacherService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service("TeacherService")
@Transactional
public class TeacherServiceImpl implements TeacherService {


    @Autowired
    private TeacherMapper teacherMapper;


    @Override
    public void add(Teacher teacher) {
        teacherMapper.add(teacher);
    }

    @Override
    public void deleteById(Integer id) {
        teacherMapper.deleteById(String.valueOf(id));
    }

    @Override
    public void edit(Teacher teacher) {
        teacherMapper.edit(teacher);
    }

    @Override
    public Teacher findById(Integer id) {
        return teacherMapper.findById(String.valueOf(id));
    }

    @Override
    public List<Teacher> findAll() {
        return teacherMapper.findAll();
    }

    @Override
    public PageResult pageQuery(QueryPageBean queryPageBean) {
        Integer currentPage = queryPageBean.getCurrentPage();
        String queryString = queryPageBean.getQueryString();
        Integer pageSize = queryPageBean.getPageSize();

        //完成分页查询 基于mybatis框架提供的分页助手插件完成
        PageHelper.startPage(currentPage, pageSize);

        Page<Teacher> page = teacherMapper.selectByCondition(queryString);
        long total = page.getTotal();
        List<Teacher> rows = page.getResult();

        return new PageResult(total, rows);
    }


}
