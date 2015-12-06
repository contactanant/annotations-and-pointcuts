package com.alpha.excercise.aop;

public class AOPWithoutSpring {
    public static void main(String args[]){

        HeavyCrunching heavyCrunching = new HeavyCrunching();

        //Pointcut with method name
        heavyCrunching.doSomeProcessing();

        //Pointcut with method annotated
        heavyCrunching.doProcessingAnnotatedMethod();
    }
}
