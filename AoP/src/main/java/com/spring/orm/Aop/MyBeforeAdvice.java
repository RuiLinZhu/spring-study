package com.spring.orm.Aop;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by User on 2019/3/7.
 * 用户自定义的前置增强类
 */
public class MyBeforeAdvice {
//    private static final Logger logger = (Logger) LoggerFactory.getLogger(MyBeforeAdvice.class);
//    定义前置方法
    public void beforeMethod(){
////        logger.debug("This is a before method by zrl");
////        logger.info("This is a before method by 朱芮林");
          System.out.println("This is a before method.");
    }
//        public void connectDB(){
//
//        }

}
