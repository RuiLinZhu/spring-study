package com.spring.Aop.IoC;

import java.util.List;

/**
 * Created by User on 2019/3/4.
 */
public class Boss {
    private String name;
    private String company;
    private Car car;
    private List<String> hobbies;
    public Boss(){

    }


    public Boss(String name, String company, Car car, List<String> hobby) {
        this.name = name;
        this.company = company;
        this.car = car;
        this.hobbies = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<String> getHobby() {
        return hobbies;
    }

    public void setHobby(List<String> hobby) {
        this.hobbies = hobby;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    public List getHobbies() {
        return hobbies;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", car=" + car +
                ", hobbies=" + hobbies +
                '}';
    }
}
