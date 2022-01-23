package com.epam.spring.homework2.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanE implements IValid {
    private String name;
    private int value;

    public BeanE() {
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println(this.getClass().getSimpleName() + " -> postConstruct");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println(this.getClass().getSimpleName() + " -> preDestroy");
    }
    @Override
    public void validator() {
        System.out.println(this.getClass().getSimpleName() + " start validation");
        if (name == null || value < 0){
            System.out.println(this.getClass().getSimpleName() + " didn't validation");
        }
    }
    @Override
    public String toString() {
        return "BeanE{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
