package com.mouds.aopannotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class UserProxyPlus {
    /**
     * 将注解中的代码提取出来
     */
    @Pointcut(value = "execution(* com.mouds.aopannotation.User.add(..))")
    public void printDemo(){
    }

    @Before(value = "printDemo()")
    public void before(){
        System.out.println("before plus ........");
    }

}
