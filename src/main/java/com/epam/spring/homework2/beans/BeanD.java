package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.annotation.Value;

public class BeanD implements IValid, IInitDestroy {
    @Value("${beanD.name}")
    private String name;
    @Value("${beanD.value}")
    private int value;

    public BeanD() {
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
        return "BeanD{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
