package com.spring.orm.IoC;

/**
 * Created by Administrator on 2019/3/4.
 */
public class MessagePrinter {
    final private MessageService service;
    public MessagePrinter(MessageService service){
        this.service=service;
    }
    public void printMessage(){
        System.out.println(this.service.getMessage());
    }
}
