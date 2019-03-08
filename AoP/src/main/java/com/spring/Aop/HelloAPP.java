package com.spring.Aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by User on 2019/3/7.
 */
public class HelloAPP {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Hello hello=context.getBean(Hello.class);
        System.out.println(hello.getHello());
    }

}
