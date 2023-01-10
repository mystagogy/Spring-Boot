package com.jpa.calendar.aop;


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

    @Pointcut("execution(* com.jpa.calendar.controller.ScheduleController.*(..))")
    public void showCalendar(){}

    @Around("showCalendar()")
    public Object around1(ProceedingJoinPoint joinPoint) throws Throwable {
        HttpSession session = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().getSession();

        if(session.getAttribute("email")==null){
            return "fail";
        }
        else{
            return joinPoint.proceed();
        }
    }
}
