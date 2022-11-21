package com.example.demo.mapper;

import com.example.demo.domain.Teacher;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeacherMapper {

    /**
     * 增加老师
     * @param teacher
     */
    public void add(Teacher teacher);

    /**
     * 修改老师信息
     * @param teacher
     */
    public void edit(Teacher teacher);

    /**
     * 查找所有老师
     * @return
     */
    public List<Teacher> findAll();

    /**
     * 根据id查询老师
     * @param id
     * @return
     */
    public Teacher findById(String id);

    /**
     * 根据id删除老师
     * @param id
     */
    public void deleteById(String id);

    /**
     * 根据条件查询 s_id 或者 s_name
     * @param queryString
     * @return
     */
    public Page<Teacher>selectByCondition(String queryString);

}
