package com.spring.Aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by User on 2019/3/11.
 */
public class Application {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
        Tiger tiger=context.getBean(Tiger.class);
        tiger.walk();
    }
}
