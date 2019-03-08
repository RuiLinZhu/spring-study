package com.spring.Aop.IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by User on 2019/3/4.
 */
public class MessageApp {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        MessagePrinter printer=context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
