package com.pf.hibernateTest;

import com.pf.hibernate.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
    @org.junit.Test
    public void testAdd(){
        //1.加载hibernate核心配置文件
        Configuration cfg = new Configuration();
        cfg.configure();
        //2.创建sessionFactory对象,读取1的内容来创建sessionFactory
        //在过程中，根据映射关系，在配置数据库里面，把表创建
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        //3.使用sessionFactory创建session
        //类似于连接
        Session session = sessionFactory.openSession();
        //4开启事务
        Transaction tx = session.beginTransaction();
        //5.写具体crud
        User user = session.get(User.class, 1);
        user.setUserName("kangkang");
        session.update(user);

//        User user = new User();
//        user.setUserName("c");
//        user.setPassword("pf3907195");
//        User user = session.get(User.class, 1);
//        System.out.println("user = " + user);
        //调用session里的方法实现添加
        //session.save(user);
        //6.提交事务
        tx.commit();

        //7.关闭资源
        session.close();
        sessionFactory.close();

    }
}
