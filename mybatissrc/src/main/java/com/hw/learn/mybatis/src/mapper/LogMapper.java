package com.hw.learn.mybatis.src.mapper;


import com.hw.learn.mybatis.src.domain.Log;

import java.util.List;

/**
 * LogMapper 日志持久化接口
 */
public interface LogMapper {
    /**
     * 查询所有的日子
     */
    List<Log> selectLogList();
}