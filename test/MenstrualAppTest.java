import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


    class MenstrualAppTest {


        @Test
        public void testForNextPeriod() {
            MenstrualApp menstrualCycleApp = new MenstrualApp();
            LocalDate date = LocalDate.of(2024, 1, 1);
            LocalDate newDate = date.plusDays(28);
            assertEquals(2024 - 1 - 29, newDate);
        }
    }
