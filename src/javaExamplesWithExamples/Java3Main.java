package javaExamplesWithExamples;
public class Java3Main {
    public static void main(String[] args) {
        Java3 num = new Java3();

        int[][] numbers   =
                {
                        { 20, 15, 6, 19, 18 }, { 4, 46, 24, 17, 18 },
                        { 12, 50, 23, 16, 31 }
                };

        num.printNumbers(numbers);
        System.out.println();
        num.sumRows(numbers);
        System.out.println();
        num.largestInRows(numbers);
        System.out.println();







    }
}
