package com.hw.learn.mybatis.src;

import com.hw.learn.mybatis.src.domain.Log;
import com.hw.learn.mybatis.src.mapper.LogMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class LogMainTest {
    public static void main(String[] args) throws IOException {

        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            LogMapper LogMapper = sqlSession.getMapper(LogMapper.class);
            List<Log> productList = LogMapper.selectLogList();
            for (Log Log : productList) {
                System.out.printf(Log.toString()+"\r\n");
            }
        } finally {
            sqlSession.close();
        }
    }
}