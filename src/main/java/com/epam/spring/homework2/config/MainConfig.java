package com.epam.spring.homework2.config;

import com.epam.spring.homework2.beans.BeanB;
import com.epam.spring.homework2.beans.BeanC;
import com.epam.spring.homework2.beans.BeanD;
import com.epam.spring.homework2.beans.IValid;
import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;

@Configuration
@Import(SecondConfig.class)
@ComponentScan("com.epam.spring.homework2.beans")
@PropertySource("classpath:application.properties")
public class MainConfig {
    @Bean(initMethod = "modifyInitMethod",
    destroyMethod = "modifyDestroyMethod")
    @DependsOn("beanD")
    public BeanB beanB(){
        return new BeanB();
    }

    @Bean(initMethod = "modifyInitMethod",
    destroyMethod = "modifyDestroyMethod")
    @DependsOn("beanB")
    public BeanC beanC(){
        return new BeanC();
    }

    @Bean(initMethod ="modifyInitMethod",
    destroyMethod = "modifyDestroyMethod")
    public BeanD beanD(){
        return new BeanD();
    }
}
