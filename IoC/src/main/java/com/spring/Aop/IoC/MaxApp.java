package com.spring.Aop.IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by User on 2019/3/4.
 */
public class MaxApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("/spring.xml");
        Max max=context.getBean(Max.class);
        System.out.println(max.getMax());
    }
}
