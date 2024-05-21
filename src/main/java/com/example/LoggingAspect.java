package com.example;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.example.*.*(..))")
    public void beforeAdvice() {
        System.out.println("Before advice: Logging method execution");
    }
}
