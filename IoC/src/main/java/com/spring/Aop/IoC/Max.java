package com.spring.Aop.IoC;

/**
 * Created by User on 2019/3/4.
 * 待测程序，求两个数的较大值
 */
public class Max {
    private int a;
    private int b;

    public Max(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getMax(){
        return a > b ? a : b;
    }
}
