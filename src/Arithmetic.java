public class Arithmetic {

    public static int squareOf(int number){
        return number * number;
    }

    public static int squareOfNegative(int number){
        number = getAbsoluteValue(number);
        int result = 0;

        for(int index = 0; index <  number; index++){
            result += number;
        }
        return result;

    }

    private static int getAbsoluteValue(int number) {
       boolean numberIsNegative = number < 0;
       if(numberIsNegative)number = -number;

       return number;
    }

    public static int addNumbers(int number, int number1) {
        return number + number1;
    }

    public static int addMultipleNumbers(int...numbers) {
        int sum = 0;
        for(int number: numbers){
            sum += number;
        }
        return sum;

    }

    public static int divideTwoNUmbers(int number1, int number) {
        return number1 / number;
    }

    public static int divideTwoNegativeNumber(int number1, int number) {
         return number1 / number;
    }

    public static int getMaxOf(int...numbers) {
        int maximum = Integer.MIN_VALUE;

        for(int number:numbers){
            if(number > maximum) maximum = number;
        }
        return maximum;


    }

    public static int getMInOf(int...numbers) {
        int minimum = Integer.MAX_VALUE;

        for(int number: numbers){
            if(number < minimum)minimum = number;
        }
        return minimum;
    }
}
