package com.thoughtworks.exercises.d.rightTriangleAsterisk;

public class RightTriangle {

    public void getRightTriangle(int n){

        String star = "";

        while (n > 0) {

            star += "*";

            System.out.println(star);

            n -= 1;
        }
    }
}
