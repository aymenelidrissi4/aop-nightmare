package org.example;


import org.aspectj.lang.JoinPoint;

public class Aspect {
    public void method(JoinPoint joinPoint){
        System.out.println("Hello from join point " + joinPoint.getSignature().getName());
    }
}
