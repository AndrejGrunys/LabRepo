package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanA implements IValid, InitializingBean, DisposableBean {
    private String name;
    private int value;

    public BeanA() {
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(this.getClass().getSimpleName()+ " -> DisposableBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.getClass().getSimpleName()+ " -> InitializingBean");
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
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

}
