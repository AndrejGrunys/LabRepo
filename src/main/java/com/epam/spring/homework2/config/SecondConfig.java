package com.epam.spring.homework2.config;

import com.epam.spring.homework2.beans.BeanF;
import com.epam.spring.homework2.beans.IValid;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class SecondConfig {
    @Bean
    @Lazy
    public IValid beanF(){
        return new BeanF();
    }
}
