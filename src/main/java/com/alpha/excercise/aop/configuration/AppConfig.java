package com.alpha.excercise.aop.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.alpha.excercise.aop")
@EnableAspectJAutoProxy
public class AppConfig {
}