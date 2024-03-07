import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LogisticsServicesTest {

    @Test
    public void test_that_a_rider_collection_rate_is_less_than_fifty_percent(){
        assertEquals(9000,LogisticsServices.services(25));
    }

    @Test
    public void test_that_a_rider_collection_rate_is_between__fifty_percent_to_fifty_nine_percent(){
        assertEquals(16400,LogisticsServices.services(57));
    }

    @Test
    public void test_that_a_rider_collection_rate_is_between_60_percent_69percent(){
        assertEquals(22250,LogisticsServices.services(69));
    }

    @Test
    public void test_that_a_rider_collection_rate_is_greater_or_equals_to_70_percent(){
        assertEquals(44500,LogisticsServices.services(79));

    }
    @Test
    public void test_that_number_of_successful_delivery_cannot_be_negative(){
        assertThrows(IllegalArgumentException.class,()->LogisticsServices.services(-1));
    }

    @Test
    public void test_that_collection_rate_cannot_be_over_hundred(){
        assertThrows(IllegalArgumentException.class,()->LogisticsServices.services(150));

    }

    @Test
    public void test_number_of_salary_is_zero_wages_is_5000(){
        assertEquals(5000,LogisticsServices.services(0));
    }
}
