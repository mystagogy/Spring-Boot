package com.jpa.calendar.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LogAdvice {

    private static final Logger log = LoggerFactory.getLogger(LogAdvice.class);

    @Around("execution(* com.jpa.calendar.controller..*Controller.*(..))"
            +" || execution(* com.jpa.calendar.service..*Service*.*(..))"
            +" || execution(* com.jpa.calendar.repository..*Repository.*(..))")
    public Object logPrint(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        //객체명
        String type = proceedingJoinPoint.getSignature().getDeclaringTypeName();

        log.info("[[START]]"+type+"."+proceedingJoinPoint.getSignature().getName()+"() <=================");
        log.info("Argument/Parameter : "+ Arrays.toString(proceedingJoinPoint.getArgs()));//<-파라미터
        log.info("================[[END : "+proceedingJoinPoint.getSignature().getName()+"()]]==================");

        return proceedingJoinPoint.proceed();
    }

}