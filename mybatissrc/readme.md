
## 最简流程
### 源代码列表
- 依赖jar包
  ```xml
    <dependency>
        <groupId>org.mybatis</groupId>
        <artifactId>mybatis</artifactId>
        <version>3.2.8</version>
    </dependency>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>5.1.30</version>
        <scope>runtime</scope>
    </dependency>
  ```
- 文件列表
  - com.hw.learn.mybatis.src.domain.Log
  - com.hw.learn.mybatis.src.mapper.LogMapper
  - com.hw.learn.mybatis.src.LogMainTest
  - mapper/LogMapper.xml
  - db.properties
  - mybatis.xml
  
## 参考文档
- [MyBatis源码解析(一)——MyBatis初始化过程解析](https://www.jianshu.com/p/7bc6d3b7fb45)