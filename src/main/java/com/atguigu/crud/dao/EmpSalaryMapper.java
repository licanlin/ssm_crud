package com.atguigu.crud.dao;

import com.atguigu.crud.bean.EmpSalary;
import com.atguigu.crud.bean.Msg;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpSalaryMapper {
    public List<EmpSalary> GetSalaryList();
    int insertOne(@Param ( "empSalary" ) EmpSalary empSalary);
    int deleteById(@Param ( "id" ) Integer id);
    int update(@Param ( "empSalary" ) EmpSalary empSalary);
}
