package com.alpha.excercise.aop.guice;

import com.alpha.excercise.annotations.Timed;
import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

public class AppConfig extends AbstractModule {

    @Override
    protected void configure() {
        bindInterceptor(Matchers.any(), Matchers.annotatedWith(Timed.class),
                new ProfileMethodInterceptor());
    }
}
