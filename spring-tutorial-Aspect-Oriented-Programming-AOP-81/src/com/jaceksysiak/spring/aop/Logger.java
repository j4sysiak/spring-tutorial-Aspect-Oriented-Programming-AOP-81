package com.jaceksysiak.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger  {
	
	@Pointcut("execution(* com.jaceksysiak.spring.aop.Camera.snap())")
	public void cameraSnap(){
	}
	 
	
	@Before("cameraSnap()")
	public void beforeAdvice(){
		System.out.println("Before advice ...");
	}

//	@After("cameraSnap()")
//	public void afterAdvice(){
//		System.out.println("After advice ...");
//	}
//	
//	@AfterReturning("cameraSnap()")
//	public void afterReturningAdvice(){
//		System.out.println("After returning advice ...");
//	}
//	
//	@AfterThrowing("cameraSnap()")
//	public void afterThrowingAdvice(){
//		System.out.println("After throwing advice ...");
//	}
//	
//	@Around("cameraSnap()")
//	public void aroundAdvice(ProceedingJoinPoint p){
//		System.out.println("Around advice (before) ...");
//		try {
//			p.proceed();
//		} catch (Throwable e) {
//			 System.out.println("In around advive: "+ e.getMessage());
//		}
//		System.out.println("Around advice (after) ...");
//	}
}





























