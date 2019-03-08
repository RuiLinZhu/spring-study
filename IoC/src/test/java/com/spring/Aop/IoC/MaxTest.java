package com.spring.Aop.IoC;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by User on 2019/3/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//指定配置文件路径
@ContextConfiguration(locations = {"/spring.xml"})
public class MaxTest{
//    自动注入max（仓库管理给斧头）
    @Autowired
    private Max max;
    @Test
    public void getMax() throws  Exception{
        assertEquals(5,max.getMax());
    }

}