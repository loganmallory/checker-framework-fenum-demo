package org.example;

import org.example.annotations.MyFenum;

public class Main {

    public static void main(String[] args) {
        shouldCompileFine();

        shouldThrowCompileError();
    }

    public static void shouldCompileFine() {
        @MyFenum long annotatedVar = 123;
        print(annotatedVar);
    }

    public static void shouldThrowCompileError() {
        long unannotatedVar = 456;
        print(unannotatedVar);
    }

    public static void print(@MyFenum long myFenum) {
        System.out.println("myFenum = " + myFenum);
    }
}
