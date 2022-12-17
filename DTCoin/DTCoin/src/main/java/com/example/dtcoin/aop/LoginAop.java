package com.example.dtcoin.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

@Component
@Aspect
public class LoginAop {

    @Pointcut("execution(public String com.example.demo.controller.PayController.*(..)) || execution(public String com.example.demo.controller.BuyController.*(..))")
    public void cut1(){}

    @Pointcut("execution(public java.util.ArrayList com.example.demo.controller.PayController.*(..)) || execution(public java.util.ArrayList com.example.demo.controller.BuyController.*(..))")
    public void cut2(){}


    @Around("cut1()")
    public Object around1(ProceedingJoinPoint joinPoint) throws Throwable {
        HttpSession session = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().getSession();

        if(session.getAttribute("email")==null){
            return "login";
        }
        else{
            return joinPoint.proceed();
        }
    }

    @Around("cut2()")
    public Object around2(ProceedingJoinPoint joinPoint) throws Throwable {
        HttpSession session = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().getSession();

        if(session.getAttribute("email")==null){
            return null;
        }
        else{
            return joinPoint.proceed();
        }
    }




}
