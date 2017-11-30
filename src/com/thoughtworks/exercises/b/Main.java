package com.thoughtworks.exercises.b;


import com.thoughtworks.exercises.b.horizontalAsterisk.HorizontalLine;

public class Main {

    public static void main(String[] args) {

        HorizontalLine horizontalLine = new HorizontalLine();

        int number = 8;

        /** displaying a horizontal asterisk line**/
        System.out.println(horizontalLine.printHorizontalLine(number));
    }
}
