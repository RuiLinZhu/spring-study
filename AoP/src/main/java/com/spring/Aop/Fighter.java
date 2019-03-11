package com.spring.Aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by User on 2019/3/11.
 */
@Aspect
public class Fighter {
    @Pointcut ("execution(* com.spring.Aop.Tiger.walk())")
    public void foundTiger(){
    }
    @Before( value="foundTiger()")
    public void foundBefore(){
        System.out.println("Fighter wait for tiger...");
    }
    @AfterReturning("foundTiger()")
    public void foundAfter(){
        System.out.println("Fighter fight with tiger...");
    }
}
