package com.atguigu.crud.service;

import com.atguigu.crud.bean.Record;
import com.atguigu.crud.dao.RecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordService {
    @Autowired
    RecordMapper recordMapper;

    public List<Record> list(Integer employeeId){
        List<Record> list = recordMapper.list ( employeeId );
        return list;
    }
}
