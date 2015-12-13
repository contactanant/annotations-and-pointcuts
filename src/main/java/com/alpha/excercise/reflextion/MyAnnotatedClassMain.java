package com.alpha.excercise.reflextion;

import com.alpha.excercise.annotations.ClassPreamble;

import java.lang.reflect.Field;

@ClassPreamble (author = "Anant", date="3/17/2002", reviewers = {"Alice", "Bob", "Cindy"})
public class MyAnnotatedClassMain {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c = Class.forName("com.alpha.excercise.reflextion.MyAnnotatedClassMain");
        ClassPreamble annotation = (ClassPreamble) c.getAnnotation(ClassPreamble.class);
        System.out.println(annotation.author());

        Field f = System.class.getField("out");
        Class c1 = f.getDeclaringClass();
        System.out.println(c1.getName());


    }
}
