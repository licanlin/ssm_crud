package com.atguigu.crud.controller;

import com.atguigu.crud.bean.EmpSalary;
import com.atguigu.crud.bean.Employee;
import com.atguigu.crud.bean.Msg;
import com.atguigu.crud.bean.Record;
import com.atguigu.crud.dao.RecordMapper;
import com.atguigu.crud.service.EmpSalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salary")
public class SalaryController {
    @Autowired
    EmpSalaryService empSalaryService;
    @Autowired
    RecordMapper recordMapper;

    @GetMapping("/list")
    public Msg getSalaryList(){
        List<EmpSalary> list = empSalaryService.GetSalaryList ();
        return Msg.success().add("salarys", list);
    }

    @PostMapping("/add")
    public Msg addSalary(@RequestBody EmpSalary empSalary){
        System.out.println (empSalary);
        boolean b = empSalaryService.insertOne ( empSalary );
        if(b == true){
            return Msg.success ();
        }
        return Msg.fail ();
    }

    @DeleteMapping("/delete/{id}")
    public Msg deleteById(@PathVariable("id") Integer id){
        return empSalaryService.deleteById ( id ) ? Msg.success ():Msg.fail ();
    }

    @PutMapping("/update")
    public Msg updateSalary(@RequestBody EmpSalary empSalary){
        return empSalaryService.update ( empSalary ) ? Msg.success ():Msg.fail ();
    }
    @GetMapping("/record/{employeeId}")
    public Msg getRecordByEmployeeId(@PathVariable Integer employeeId){
        List<Record> list = recordMapper.list ( employeeId );
        return Msg.success ().add ( "list", list);
    }



}
