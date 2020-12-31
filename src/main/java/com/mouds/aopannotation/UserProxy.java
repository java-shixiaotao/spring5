package com.mouds.aopannotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class UserProxy {
    /**
     * 将注解中的代码提取出来
     */
    @Pointcut(value = "execution(* com.mouds.aopannotation.User.add(..))")
    public void printDemo(){
    }

    @Before(value = "printDemo()")
    public void before(){
        System.out.println("before ........");
    }

    @After(value = "printDemo()")
    public void after(){
        System.out.println("after ........");
    }

    @AfterReturning(value = "printDemo()")
    public void afterReturning(){
        System.out.println("afterReturning ........");
    }

    @AfterThrowing(value = "printDemo()")
    public void afterThrowing(){
        System.out.println("afterThrowing ........");
    }


    @Around(value = "printDemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around之前 ........");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("around之后 ........");
    }


}
