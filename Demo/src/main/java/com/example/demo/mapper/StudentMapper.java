package com.example.demo.mapper;

import com.example.demo.domain.Student;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentMapper {

    /**
     * 增加学生
     * @param student
     */
    public void add(Student student);

    /**
     * 修改学生信息
     * @param student
     */
    public void edit(Student student);

    /**
     * 查找所有学生
     * @return
     */
    public List<Student> findAll();

    /**
     * 根据id查找学生
     * @param id
     * @return
     */
    public Student findById(String id);

    /**
     * 根据id删除学生
     * @param id
     */
    public void deleteById(String id);

    /**
     * 根据条件查询 s_id 或者 s_name
     * @param queryString
     * @return
     */
    public Page<Student>selectByCondition(String queryString);

}
