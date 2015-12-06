package com.alpha.excercise.aop;

import org.springframework.stereotype.Component;

@Component
public class HeavyCrunching {

    public void doSomeProcessing() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Timed
    public void doProcessingAnnotatedMethod() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
