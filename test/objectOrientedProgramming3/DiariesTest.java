package objectOrientedProgramming3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DiariesTest {

    private  Diaries diaries;

    //private final ArrayList<Diary> diaries = new ArrayList<>();
    @BeforeEach
    public void initializer(){
        diaries = new Diaries();
    }
    @Test
    public void addDiary(){
        diaries.addDiary("user name","password");
        assertEquals(1,diaries.getDiary().size());
    }

    @Test
    public void findDiaryByUserName(){
        diaries.addDiary("user name","password");
        Diary foundDiary = diaries.findByUserName("user name");
        assertEquals("user name",foundDiary.getUserName());
    }
    @Test
    public void findDiaryByIncorrectUserName_throwInvalidUserName(){
        diaries.addDiary("user name","password");
        assertThrows(NoSuchDiaryExistException.class,()-> diaries.findByUserName("praise"));

    }

    @Test
    public void delete(){
        diaries.addDiary("user name","password");
        diaries.delete("user name", "password");
        assertEquals(0,diaries.getNumberOfDiaries());
    }

    @Test
    public void deleteDiaryWithIncorrectUserNameAndPassword_throwNoSuchDiaryExistException(){
        diaries.addDiary("user name","password");
        assertThrows(NoSuchDiaryExistException.class,()->diaries.delete("praise","oyewole"));
        assertEquals(1,diaries.getNumberOfDiaries());
    }
}
