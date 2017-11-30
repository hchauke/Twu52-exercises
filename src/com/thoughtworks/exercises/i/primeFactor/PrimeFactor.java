package com.thoughtworks.exercises.i.primeFactor;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    public List<Integer> generate(int n) {

        List<Integer> number = new ArrayList<Integer>();

        int factor = 2;

        while (n > 1) {

            while (n % factor == 0) {
                number.add(factor);
                n = n/ factor;
            }
            factor ++;
        }
        return number;
    }
}
