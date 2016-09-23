package com.thoughtworks.exercises.h.fizzBuzz;

public class FizzBuzz implements  Divide{

    public void fizzBuzz() {

        for (int i = 1; i <= 100; i++) {

            String fizz = "Fizz";
            String buzz = "Buzz";

            if (isDivisibleByThree(i) && isDivisibleByFive(i)) {

                System.out.println(fizz + "" + buzz);

            } else if (isDivisibleByThree(i)) {

                System.out.println(fizz);

            } else if (isDivisibleByFive(i)) {

                System.out.println(buzz);

            } else {

                System.out.println(i);
            }
        }
    }

    @Override
    public boolean isDivisibleByThree(int number) {
        boolean status = false;

        if (number % 3 == 0){

            status = true;
        }
        return status;
    }

    @Override
    public boolean isDivisibleByFive(int number) {
        boolean status = false;

        if (number % 5 == 0){

            status = true;
        }
        return status;
    }
}
