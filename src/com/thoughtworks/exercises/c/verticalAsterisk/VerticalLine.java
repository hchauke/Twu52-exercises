package com.thoughtworks.exercises.c.verticalAsterisk;

public class VerticalLine {

    public String printVerticalLine(int n) {

        String star = "*";

        while (n > 1) {

            System.out.println(star);

            n--;
        }
        return star;
    }
}
