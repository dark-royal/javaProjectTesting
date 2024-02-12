package javaExamplesWithExamples;

public class Java3 {

    public  void printNumbers(int[][] numbers) {
        for (int[] number : numbers) {
            for (int i : number) {
                System.out.printf("%7d", i);
            }
            System.out.println();
        }
    }

    public  void sumRows(int[][] numbers) {
        int sum = 0;

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                sum = sum + numbers[row][col];
            }
            System.out.println("The sum of rows" + (row + 1) + "=" + sum);

        }


    }

    public  void largestInRows(int[][] numbers) {
        int largest;

        for (int row = 0; row < numbers.length; row++) {
            largest = numbers[row][0];

            for (int col = 1; col < numbers[row].length; col++) {
                if (largest < numbers[row][col]) largest = numbers[row][col];
            }

            System.out.println("The largest element of row" + (row + 1 + "=" + largest));

        }
    }
}

