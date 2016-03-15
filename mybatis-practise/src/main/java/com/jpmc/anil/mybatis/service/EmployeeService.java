package com.jpmc.anil.mybatis.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jpmc.anil.mybatis.mappers.StudentMapper;
import com.jpmc.anil.mybatis.util.MybatisSqlSessionFactory;

public class EmployeeService {

    Logger logger = LoggerFactory.getLogger(getClass());

    public List<EmployeeWrapper> findAllEmployees() {
        SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
        try {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            return studentMapper.findAllEmployees();
        } finally {
            sqlSession.close();
        }
    }

}
