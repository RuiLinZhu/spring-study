package com.spring.orm.Aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by User on 2019/3/11.
 */
public class ImageCopyApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
        ImageCopy imageCopy=context.getBean(ImageCopy.class);
        try{
            imageCopy.copyImage();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
