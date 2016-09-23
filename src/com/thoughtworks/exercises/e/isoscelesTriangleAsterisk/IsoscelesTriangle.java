package com.thoughtworks.exercises.e.isoscelesTriangleAsterisk;

public class IsoscelesTriangle {

    public void getIsoscelesTriangle(int n) {

        int bottomSize = (2 * n) - 1;

        String star = "*";
        String space = " ";

        int star_count;
        int space_count;

        for (int count = 0; count < n; count++) {

            star_count = (2 * count) + 1;

            space_count = (bottomSize - star_count) / 2;

            for (int j = 0; j < space_count; j++) {

                System.out.print(space);
            }

            for (int k = 0; k < star_count; k++) {

                System.out.print(star);
            }

            /** print new line**/
            System.out.println();
        }
    }
}
