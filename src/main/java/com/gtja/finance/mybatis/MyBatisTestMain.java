package com.gtja.finance.mybatis;

import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MyBatisTestMain {
    public static void main(String[] args) {
        /*//1. 声明配置⽂文件的目录
        String conf = "conf.xml";
        //2. 加载应⽤用配置⽂文件
        InputStream is = MyBatisTestMain.class.getClassLoader().getResourceAsStream(conf);
        //3. 创建SqlSessonFactory
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        // 4. 获取Session
        SqlSession session = sessionFactory.openSession();*/


        //通过注解方式
        // 1. 声明配置⽂文件的⺫⽬目录渎职
        String resource = "confAnnotation.xml";
        // 2. 加载应⽤用配置⽂文件
        InputStream is = MyBatisTestMain.class.getClassLoader()
                .getResourceAsStream(resource);
        // 3. 创建SqlSessonFactory
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder()
                .build(is);
        Configuration conf = sessionFactory.getConfiguration();
        conf.addMapper(GetUserInfo.class);
    // 4. 获取Session
        SqlSession session = sessionFactory.openSession();
        try {
            GetUserInfo getUserInfo = session.getMapper(GetUserInfo.class);
            User user = getUserInfo.getUser(1);
            System.out.println(user.getId() + " " + user.getUserName() + " " + user.getCorp());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

    }
}
