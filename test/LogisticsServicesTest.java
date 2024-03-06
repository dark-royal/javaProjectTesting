import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
