package com.alpha.excercise.aop.guice;

import com.alpha.excercise.process.MyProcess;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GoogleJuiceAOPDemo {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AppConfig());
        MyProcess myProcess = injector.getInstance(MyProcess.class);
        myProcess.doProcessing();
        myProcess.doProcessingAnnotated();
    }
}
