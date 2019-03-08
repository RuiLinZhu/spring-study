package com.spring.Aop;

/**
 * Created by User on 2019/3/7.
 */
public class Tank implements Move{

    @Override
    public void move() {
        System.out.println("Tank is moving.....");
    }
}
