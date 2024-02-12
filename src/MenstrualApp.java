import java.time.LocalDate;

public class MenstrualApp {

    public LocalDate checkNextPeriod(int cycleLength,int year, int month, int day){
        LocalDate date = LocalDate.of(2024, 1, 1);
        LocalDate newDate = date.plusDays(cycleLength);

        return newDate;

    }

}
