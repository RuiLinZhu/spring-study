package com.spring.IoC.quickstart.annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by User on 2019/2/28.
 */
@Component
@Data
public class Student {
    @Value("Tim")
    private String name;
    @Value("19")
    private int age;
//    使用@Autowired注入一个Phone类型的bean
    @Autowired
    private Phone phone;
}
