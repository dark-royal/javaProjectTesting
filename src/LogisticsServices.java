public class LogisticsServices {

    public static int services(int numberOfSuccessfulDelivery) {
        int wagesForTheDay = 0;
        int basePay = 5000;
        if (numberOfSuccessfulDelivery < 50) {
            int amountPerParcel = 160;
            wagesForTheDay = numberOfSuccessfulDelivery * amountPerParcel + basePay;
        }
        else if(numberOfSuccessfulDelivery > 50 && numberOfSuccessfulDelivery <= 59){
            int amountPerParcel = 200;
            wagesForTheDay = numberOfSuccessfulDelivery * amountPerParcel + basePay;
        }
        else if (numberOfSuccessfulDelivery > 60 && numberOfSuccessfulDelivery <= 69) {
            int amountPerParcel = 250;
            wagesForTheDay = numberOfSuccessfulDelivery * amountPerParcel + basePay;
        }
        else if (numberOfSuccessfulDelivery >= 70){
            int amountPerParcel = 500;
            wagesForTheDay = numberOfSuccessfulDelivery * amountPerParcel + basePay;
        }
        if (numberOfSuccessfulDelivery < 0 || numberOfSuccessfulDelivery > 100){
            throw new IllegalArgumentException("Invalid input");
        }
        return wagesForTheDay;
    }






}
