package com.thoughtworks.exercises.g.diamondwithNameAsterisk;

public class DiamondWithName {

    public void getDiamondWithName(int n) {

        int centreSize = (n * 2) - 1;

        String star = "*";

        String space = " ";

        String name = "Bill";

        for (int i = 0; i < n; i++) {

            if (i == n -1) {
                System.out.println(name);
                break;
            }

            int starCounter = (i * 2) + 1;
            int spaceCounter = (centreSize - starCounter) / 2;

            for (int j = 0; j < spaceCounter; j++) {
                System.out.print(space);
            }

            for (int k = 0; k < starCounter; k++) {
                System.out.print(star);
            }

            System.out.println();
        }


        for (int i = n - 1; i > 0; i--) {

            int asteriskCount = (i * 2) - 1;
            int whiteSpace = (centreSize - asteriskCount) / 2;

            for (int j = 0; j < whiteSpace; j++)
                System.out.print(space);

            for (int k = 0; k < asteriskCount; k++)
                System.out.print(star);

            System.out.println();
        }
    }
}
