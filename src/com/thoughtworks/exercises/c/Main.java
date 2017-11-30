package com.thoughtworks.exercises.c;


import com.thoughtworks.exercises.c.verticalAsterisk.VerticalLine;

public class Main {

    public static void main(String[] args) {

        VerticalLine verticalLine = new VerticalLine();

        int number = 3;

        /** displaying a vertical asterisk line**/
        System.out.println(verticalLine.printVerticalLine(number));
    }
}
