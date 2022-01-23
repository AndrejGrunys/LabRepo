package com.epam.spring.homework2;

import com.epam.spring.homework2.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanName = context.getBeanDefinitionNames();
        for (String bean: beanName) {
            System.out.println(context.getBean(bean));
        }
        context.close();
    }
}
