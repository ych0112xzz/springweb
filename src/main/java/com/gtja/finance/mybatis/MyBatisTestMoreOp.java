package com.gtja.finance.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MyBatisTestMoreOp {
    public static void main(String[] args) {
        //1. 声明配置⽂文件的目录
        String conf = "conf.xml";
        //2. 加载应⽤用配置⽂文件
        InputStream is = MyBatisTestMain.class.getClassLoader().getResourceAsStream(conf);
        //3. 创建SqlSessonFactory
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        // 4. 获取Session
        SqlSession session = sessionFactory.openSession(true);
        try {

            // 5. 获取操作类
            UserOp userOp = session.getMapper(UserOp.class);
            User user = new User("XiaoMing", "Netease");
            // 插⼊用户
            userOp.addUser(user);
            System.out.println(user.getId());
            // 查询用户
            user = userOp.getUser(user.getId());
            System.out.println("userId:" + user.getId() + ", userName:"
                    + user.getUserName() + ", corp:" +
                    user.getCorp());
            user.setUserName("LiMing");
            // 更新⽤用户
            userOp.updateUser(user);
            System.out.println("userId:" + user.getId() + ", userName:"
                    + user.getUserName() + ", corp:" +
                    user.getCorp());
            // 删除⽤用户
          //  userOp.deleteUser(user);
        } finally {
           // session.commit();
            // 7.关闭Session
            session.close();
        }
    }


}
