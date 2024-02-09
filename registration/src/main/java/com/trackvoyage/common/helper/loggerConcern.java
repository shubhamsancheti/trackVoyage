package com.trackvoyage.common.helper;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class loggerConcern {
	
	@Pointcut("execution(* com.trackvoyage.controller.getAllUsers())")
	public void getAllUsersPointcut(){}
	
	@Before("execution(* *(*)")
	public void beforeGetAllUsersAdvice() {
		System.out.println("method entry ");
	}
	
}