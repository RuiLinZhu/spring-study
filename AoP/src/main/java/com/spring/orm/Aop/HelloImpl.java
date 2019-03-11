package com.spring.orm.Aop;

/**
 * Created by User on 2019/3/7.
 */
public class HelloImpl implements Hello{
    @Override
    public String getHello() {
        return "Hello,Spring Aop";
    }
}
