package com.atguigu.crud.service;

import com.atguigu.crud.bean.EmpSalary;
import com.atguigu.crud.bean.Employee;
import com.atguigu.crud.dao.EmpSalaryMapper;
import com.atguigu.crud.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpSalaryService {
    @Autowired
    EmpSalaryMapper empSalaryMapper;
    @Autowired
    EmployeeMapper employeeMapper;

    public List<EmpSalary> GetSalaryList(){
        return empSalaryMapper.GetSalaryList ();
    }
    public boolean insertOne(EmpSalary empSalary){
        //获取员工id
        Integer employeeId = empSalary.getEmployeeId ();
        //查询员工是否存在
        Employee employee = employeeMapper.selectByPrimaryKey ( employeeId );
        if(employee == null){
            //员工不存在，返回false；
            return false;
        }

        int i = empSalaryMapper.insertOne ( empSalary );
        System.out.println ("i = " + i);

        if(i > 0){
            //插入成功
            return true;
        }
        return false;

    }
    public boolean deleteById(Integer id){
        int i = empSalaryMapper.deleteById ( id );
        return i > 0;
    }
    public boolean update(EmpSalary empSalary){
        //获取员工id
        Integer employeeId = empSalary.getEmployeeId ();
        //查询员工是否存在
        Employee employee = employeeMapper.selectByPrimaryKey ( employeeId );
        if(employee == null){
            //员工不存在，返回false；
            return false;
        }
        System.out.println (empSalary);
        int update = empSalaryMapper.update ( empSalary );
        return update > 0;

    }
}
