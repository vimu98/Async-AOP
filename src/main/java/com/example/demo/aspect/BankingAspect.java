package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BankingAspect {

    @Pointcut("execution(* com.example.demo.service.TransferService.*(..))")
    public void transferMethod(){}

    @Before("transferMethod()")
    public void logBefore(){
        System.out.println("[LOG] Starting transferMoney");
    }

    @AfterReturning(pointcut = "transferMethod()", returning = "result")
    public void logReturn(JoinPoint joinPoint, Object result){
        System.out.println("[LOG] Result : " + result);
    }

    @AfterThrowing(pointcut = "transferMethod()", throwing = "ex")
    public void logException(JoinPoint joinPoint, Exception ex){
        System.out.println("[LOG] Exception: " + ex.getMessage());
    }

    @Around("transferMethod()")
    public Object logTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("[LOG] " + duration + " ms");

        return result;
    }

}
