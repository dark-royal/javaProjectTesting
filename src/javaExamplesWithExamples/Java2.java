package javaExamplesWithExamples;

public class Java2 {
    public static void main(String[] args) {
        int[][] values = {{12, 23, 24}, {77, 12, 56}, {70, 80, 90}};

        for (int row = 0; row < values.length; row++) {
            for (int col = 0; col < values[row].length; col++) {
                System.out.print(values[row][col] + " ");
            }
            System.out.println();
        }
    }
    }

