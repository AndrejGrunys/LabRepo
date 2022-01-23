package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.annotation.Value;

public class BeanB implements IValid, IInitDestroy {
    @Value("${beanB.name}")
    private String name;
    @Value("${beanB.value}")
    private int value;

    public BeanB() {
    }

    public void BFPPInitMethod(){
        System.out.println(this.getClass().getSimpleName()+" -> BFPPInitMethod");
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
        return "BeanB{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
