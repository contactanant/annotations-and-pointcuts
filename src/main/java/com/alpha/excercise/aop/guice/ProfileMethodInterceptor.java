package com.alpha.excercise.aop.guice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class ProfileMethodInterceptor implements MethodInterceptor {

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        return runMethodAndLogTime(methodInvocation);
    }

    private Object runMethodAndLogTime(MethodInvocation invocation) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("Guice aopalliance Interceptor Going to call the method.");
        Object output = invocation.proceed();
        System.out.println("Method execution completed.");
        long elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Method execution time: " + elapsedTime + " milliseconds.");
        return output;
    }
}
