package com.alpha.excercise.reflextion;

import com.alpha.excercise.annotations.ClassPreamble;

import java.util.function.IntConsumer;

@ClassPreamble(author = "Anant", date="3/17/2002", reviewers = {"Alice", "Bob", "Cindy"})
public class ClassWithVariousProperties implements IntConsumer{

    @Override
    public void accept(int value) {

    }

    @Override
    public IntConsumer andThen(IntConsumer after) {
        return null;
    }
}
