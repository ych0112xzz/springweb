package com.gtja.finance.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");//读取resources目录下文件
         Header header = context.getBean("header", StraightHeader.class);
        header.dowork();
        System.out.println(header.getInfo());

        ScrewDriver screwDriver =  context.getBean("screwDriver",ScrewDriver.class);
        screwDriver.use();



        ((ClassPathXmlApplicationContext) context).close();

    }
}
