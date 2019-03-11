package com.spring.orm.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by User on 2019/3/11.
 */
@Table(name = "t_user")
@Data
public class User {
//    标注主键和主键生成策略
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String account;
    private String password;
    private Integer credit;
}
