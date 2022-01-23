package com.epam.spring.homework2.beans;

public class BeanF implements IValid {
    private String name;
    private int value;

    public BeanF() {
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
        return "BeanF{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
