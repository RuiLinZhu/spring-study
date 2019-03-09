package com.spring.IoC.quickstart.annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 采用注解和Lombok开发的Phone类
 */
@Component
@Data
public class Phone {
    @Value("YU FLY")
    private String brand;

    @Value("100.86")
    private double price;
}
