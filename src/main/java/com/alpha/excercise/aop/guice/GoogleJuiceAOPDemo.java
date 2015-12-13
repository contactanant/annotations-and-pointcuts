package com.alpha.excercise.aop.guice;

import com.alpha.excercise.process.HeavyCrunching;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GoogleJuiceAOPDemo {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AppConfig());
        HeavyCrunching heavyCrunching = injector.getInstance(HeavyCrunching.class);
        heavyCrunching.doProcessingAnnotatedMethod();
    }
}
