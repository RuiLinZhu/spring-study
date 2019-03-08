package com.spring.Aop;


import org.apache.log4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Created by User on 2019/3/8.
 */
public class UserDAOImpl implements UserDAO {
    private static final org.slf4j.Logger logger =  getLogger(UserDAO.class);
    @Override
    public void insert() {
        logger.info("开始进行插入操作。。。");

    }
}
