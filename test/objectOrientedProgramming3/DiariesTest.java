package objectOrientedProgramming3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiariesTest {

    private  Diaries diaries;

    private final ArrayList<Diary> dairies = new ArrayList<>();

    public void initializer(){
        diaries = new Diaries();
    }
    @Test
    public void addDiary(){
        Diary diary = new Diary("user name","password");
        Diary diary1 = new Diary("praise","pass");
        assertEquals(2,diaries.getDiary().size());

    }
}
