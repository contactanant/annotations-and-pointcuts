package com.alpha.excercise.aop.spring;

import com.alpha.excercise.process.HeavyCrunching;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringAnnotationConfigAOPDemo {

    public static void main(String args[]){
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        HeavyCrunching heavyCrunching = (HeavyCrunching) context.getBean("heavyCrunching");

        //Pointcut with method name
//        heavyCrunching.doSomeProcessing();

        //Pointcut with method annotated
        heavyCrunching.doProcessingAnnotatedMethod();
        context.close();
    }

}
