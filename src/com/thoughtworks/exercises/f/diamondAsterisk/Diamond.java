package com.thoughtworks.exercises.f.diamondAsterisk;

public class Diamond {

    public void getDiamond(int n) {

        int centreSize = (n * 2) - 1;

        String star = "*";

        String space = " ";

        for (int i = 0; i < n; i++) {

            int starCounter = (i * 2) + 1;
            int spaceCounter = (centreSize - starCounter) / 2;

            for (int j = 0; j < spaceCounter; j++) {
                System.out.print(space);
            }

            for (int k = 0; k < starCounter; k++) {
                System.out.print(star);
            }

            /** print new line**/
            System.out.println();
        }

        for (int i = n - 1; i > 0; i--) {

            int starCounter = (2 * i) - 1;

            int spaceCounter = (centreSize - starCounter) / 2;

            for (int j = 0; j < spaceCounter; j++) {
                System.out.print(space);
            }

            for (int k = 0; k < starCounter; k++) {
                System.out.print(star);
            }

            /** print new line**/
            System.out.println();
        }
    }

}
