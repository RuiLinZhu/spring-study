package com.spring.orm.Aop;

/**
 * Created by User on 2019/3/8.
 */
public class TestTank {
    public static void main(String[] args) {
        Tank tank =new Tank();
        Move move = new TankProxy(tank );
        move.move();
    }
}
