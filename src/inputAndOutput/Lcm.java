package inputAndOutput;

public class Lcm {
    public static void main(String[] args) {
        int[] number = {6, 4, 8};
        System.out.println((getLcm(number)));
    }

    public static int getLcm(int[] number) {
        int maximum = number[0];
        int lcm = 0;
        for (int index = 0; index < number.length; index++) {
            if (maximum < number[index]) maximum = number[index];
        }
        for (int array = maximum; array >= 1; array--) {
            lcm  = maximum;
            for (int j = 1; j < array; j++) {
                if(array % j == 0){
                    break;
                }
                lcm+= maximum;

            }



        }
        return lcm;
    }
}






