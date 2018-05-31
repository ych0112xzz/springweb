package com.gtja.finance.mybatis.resultMap;

import com.gtja.finance.mybatis.MyBatisTestMain;
import com.gtja.finance.mybatis.resultMap.dao.UserOp;
import com.gtja.finance.mybatis.resultMap.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class resultMapMain {
    public static void main(String[] srga) {
         //1. 声明配置⽂文件的目录
        String conf = "conf.xml";
        //2. 加载应⽤用配置⽂文件
        InputStream is = MyBatisTestMain.class.getClassLoader().getResourceAsStream(conf);
        //3. 创建SqlSessonFactory
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        // 4. 获取Session
        SqlSession session = sessionFactory.openSession();



        try {
            UserOp userOp = session.getMapper(UserOp.class);
            User user = userOp.getUser(11);
            System.out.println(user.getId() + " " + user.getUserName() + " " + user.getCorp());
            System.out.println(user.getCourses().get(0).getCourseName());
            System.out.println(user.getCourses().get(0).getTeacher().getTeacherName());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
