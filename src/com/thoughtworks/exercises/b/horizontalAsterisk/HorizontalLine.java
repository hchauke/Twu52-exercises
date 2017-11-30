package com.thoughtworks.exercises.b.horizontalAsterisk;

public class HorizontalLine {

    public String printHorizontalLine(int n){

        String star = "";

        while (n > 0) {

            star += "*";

            n--;
        }
        return star;
    }
}
