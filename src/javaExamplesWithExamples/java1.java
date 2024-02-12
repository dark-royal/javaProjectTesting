package javaExamplesWithExamples;

public class java1 {

    public static void main(String[] args) {
        int[][] values = {{12, 23, 24}, {77, 12, 56}, {70, 80, 90}};

        for (int rows = 0; rows < 3; rows++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(values[rows][column] + " ");
            }

            System.out.println();
        }

    }
}
