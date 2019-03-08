package com.spring.Aop.IoC;

/**
 * Created by User on 2019/3/4.
 */
public class MessagePrinter {
    final private MessageService service;
    public  MessagePrinter(MessageService service){
        this.service=service;
    }
    public void printMessage(){
        System.out.print(this. service.getMessage());
    }

}
