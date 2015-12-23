package com.alpha.excercise.process;


import com.alpha.excercise.annotations.Timed;

import javax.inject.Inject;

public class MyProcess {
    private final HeavyCrunching heavyCrunching;

    @Inject
    public MyProcess(HeavyCrunching heavyCrunching) {
        this.heavyCrunching = heavyCrunching;
    }

    public void doProcessing() {
        heavyCrunching.doSomeProcessing();
    }

    @Timed
    public void doProcessingAnnotated() {
        heavyCrunching.doProcessingAnnotatedMethod();
    }
}
