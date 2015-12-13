package com.alpha.excercise.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProfileMethodAspect {

    //http://docs.spring.io/spring/docs/current/spring-framework-reference/html/aop.html
    // Point cuts can be on particular package, any class , particular public method
    @Pointcut("execution(* doSomeProcessing(..))")
    public void businessMethods() { }

    // Point cuts can be on particular package, any class , any public method and annotated with timed
    @Pointcut("execution(* com.alpha.excercise.*.*.*(..)) && @annotation(com.alpha.excercise.annotations.Timed)")
    public void annotatedBusinessMethods() { }

    @Around("businessMethods()")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
        return runMethodAndLogTime(pjp);
    }

    @Around("annotatedBusinessMethods()")
    public Object profileAnnoatedMethod(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Found @Timed Annotated method");
        return runMethodAndLogTime(pjp);
    }

    private Object runMethodAndLogTime(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("AspectJ aspect, going to call the method.");
        Object output = pjp.proceed();
        System.out.println("Method execution completed.");
        long elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Method execution time: " + elapsedTime + " milliseconds.");
        return output;
    }
}
