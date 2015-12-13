package com.alpha.excercise.aop.spring;

import com.alpha.excercise.process.HeavyCrunching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlConfigAOPDemo {

    public static void main(String args[]){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("appContext.xml");

        HeavyCrunching heavyCrunching = (HeavyCrunching) context.getBean("heavyCrunching");

        //Pointcut with method name
        heavyCrunching.doSomeProcessing();

        //Pointcut with method annotated
        heavyCrunching.doProcessingAnnotatedMethod();
    }

}
