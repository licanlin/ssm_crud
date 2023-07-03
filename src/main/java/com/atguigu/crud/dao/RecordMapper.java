package com.atguigu.crud.dao;

import com.atguigu.crud.bean.Record;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecordMapper {
    List<Record> list(@Param ( "employeeId" ) Integer employeeId);
}
