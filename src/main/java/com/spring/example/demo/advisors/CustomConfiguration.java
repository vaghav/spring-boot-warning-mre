package com.spring.example.demo.advisors;

import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfiguration {

    @Bean
    public Advisor advisorBean() {
        var advisor = new AspectJExpressionPointcutAdvisor();
        advisor.setExpression("within(com.spring.example.demo..*Arshak)");
        return advisor;
    }
}
