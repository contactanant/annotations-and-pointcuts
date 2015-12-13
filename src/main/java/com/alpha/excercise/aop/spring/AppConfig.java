package com.alpha.excercise.aop.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.alpha.excercise")
@EnableAspectJAutoProxy
public class AppConfig {
}