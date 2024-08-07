package com.example.demo.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.example.demo.Entity.Department;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class MyAspect {

//	@Pointcut("execution(* com.example.demo.Controller.*.*(..))")
	
	//withinn package
//	@Pointcut("within(com.example.demo.Controller.*)")
	
	//particular particular service
	@Pointcut("this(com.example.demo.Controller.DepartmentController)")


	// * Any return type available in pakage
	// [ .*.* (class name.method name)]
	// (..) one or more Arguments.
	public void loggingPointcut() {
	}

	/*
	 * // Before Advice
	 * 
	 * @Before("loggingPointcut()") public void before(JoinPoint joinPoint) {
	 * log.info("Before method executed..." + joinPoint.getSignature()); }
	 * 
	 * // Before Advice
	 * 
	 * @After("loggingPointcut()") public void after(JoinPoint joinPoint) {
	 * log.info("after method executed..." + joinPoint.getSignature()); }
	 * 
	 * // after returning
	 * 
	 * @AfterReturning(value = "execution(* com.example.demo.Controller.*.*(..))",
	 * returning = "department") public void afterReturning(JoinPoint joinPoint,
	 * Department department) { log.info("After returning method executed" +
	 * department);
	 * 
	 * }
	 * 
	 * // after Throwing
	 * 
	 * @AfterThrowing(value = "execution(* com.example.demo.Controller.*.*(..))",
	 * throwing = "ex") public void afterReturning(JoinPoint joinPoint, Exception
	 * ex) { log.info("After throwning method executed" + ex.getMessage());
	 * 
	 * }
	 */
	@Around("loggingPointcut()")
	public Object aroundBefore(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		log.info("around Before Method" + proceedingJoinPoint.getSignature());
		// before executing proceed() it will return the above request
		Object object = proceedingJoinPoint.proceed();
		// after executing it will return the response

		if (object instanceof Department) {
			log.info("around after Method" + proceedingJoinPoint.getSignature());
		} else {
			log.info("Null");
		}
		return object;
	}
}
