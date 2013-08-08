package com.xiaolong.aop;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAdvice {
	@Around("execution(* com.xiaolong.svc.EmployeeService.*(..))")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable{
		double a = System.currentTimeMillis();
		joinPoint.proceed();
		double b = System.currentTimeMillis();
		System.out.println("The time it take to run " + joinPoint.getSignature().getName() + " is " + (b-a));
	}

}
