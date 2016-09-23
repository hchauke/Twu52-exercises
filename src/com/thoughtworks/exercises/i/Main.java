package com.thoughtworks.exercises.i;


import com.thoughtworks.exercises.i.primeFactor.PrimeFactor;

public class Main {

    public static void main(String[] args) {

        PrimeFactor primeFactor = new PrimeFactor();

        System.out.printf("Prime factors of number '%d' are : %s %n", 30, primeFactor.generate(15));
    }
}
