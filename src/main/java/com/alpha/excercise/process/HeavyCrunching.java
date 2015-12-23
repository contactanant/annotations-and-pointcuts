package com.alpha.excercise.process;

import com.alpha.excercise.annotations.Timed;
import org.springframework.stereotype.Component;

@Component
public class HeavyCrunching {

    public void doSomeProcessing() {
        try {
            System.out.println("Sleeping, this is my heavy crunching but not annotated");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Timed
    public void doProcessingAnnotatedMethod() {
        try {
            System.out.println("Sleeping, this is my heavy crunching");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
