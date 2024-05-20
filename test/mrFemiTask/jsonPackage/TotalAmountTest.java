package mrFemiTask.jsonPackage;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class TotalAmountTest {

    @Test
    public void testTotal() throws IOException {
        String path = "C:\\Users\\DELL\\IdeaProjects\\ClassFire\\src\\mrFemiTask\\jsonPackage\\trancation.json";
        int total = 100000;
        assertEquals(total,TotalAmount.getTotal(path));
    }
}