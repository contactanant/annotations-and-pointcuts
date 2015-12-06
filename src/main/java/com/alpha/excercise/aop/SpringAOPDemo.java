package com.alpha.excercise.aop;

import com.alpha.excercise.aop.configuration.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringAOPDemo {

    public static void main(String args[]){
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        HeavyCrunching heavyCrunching = (HeavyCrunching) context.getBean("heavyCrunching");
        heavyCrunching.doSomeProcessing();
        heavyCrunching.doProcessingAnnotatedMethod();
        context.close();
    }

}
