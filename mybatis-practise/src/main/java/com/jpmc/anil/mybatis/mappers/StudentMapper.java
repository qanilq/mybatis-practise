package com.jpmc.anil.mybatis.mappers;

import java.util.List;

import com.jpmc.anil.mybatis.Student;
import com.jpmc.anil.mybatis.service.EmployeeWrapper;

public interface StudentMapper {
    List<Student> findAllStudents();

    Student findStudentById(Integer id);

    void insertStudetn(Student student);

    List<EmployeeWrapper> findAllEmployees();
}
