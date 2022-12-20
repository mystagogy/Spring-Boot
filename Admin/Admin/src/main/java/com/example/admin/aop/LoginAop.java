package com.example.admin.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

@Aspect
@Component
public class LoginAop {
    @Pointcut("execution(* com.example.admin.controller.IndexController.*(..))")
    public void cut(){}

    @Pointcut("execution(* com.example.admin.controller.ListController.*(..))")
    public void cut2(){}

    @Around("cut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        HttpSession session = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().getSession();

        if(session.getAttribute("id")==null){
            return 0;
        }
        else{
            return joinPoint.proceed();
        }
    }

    @Around("cut2()")
    public Object around2(ProceedingJoinPoint joinPoint) throws Throwable {
        HttpSession session = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().getSession();

        if(session.getAttribute("id")==null){
            return null;
        }
        else{
            return joinPoint.proceed();
        }
    }
}
