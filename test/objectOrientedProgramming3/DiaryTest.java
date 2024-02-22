package objectOrientedProgramming3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {

    private Diary diary;

    @BeforeEach
    public void initializer(){
        diary = new Diary("userName","password");
    }

    @Test
    public void diary_is_locked(){
        assertTrue(diary.isLocked());

    }
    @Test
    public void testThatDiaryIsUnlocked_with_correctPin(){
        diary.unlock("password");
        assertFalse(diary.isLocked());
    }


    @Test
    public void unlockDiaryWithIncorrectPin_throwInvalidPinException(){
        assertTrue(diary.isLocked());
        assertThrows(InvalidPassWordException.class,()-> diary.unlock("incorrect PassWord"));
        assertTrue(diary.isLocked());

    }

    @Test
    public void testThatDiaryCanCreateEntry(){
        diary.lockDiary();
        assertTrue(diary.isLocked());
        diary.unlock("password");
        assertFalse(diary.isLocked());
        diary.createEntry("title","body");
        assertEquals(1,diary.getNumberOfEntry());

    }

    @Test
    public void testThatDairyCanCreateTwoEntry(){
        diary.lockDiary();
        assertTrue(diary.isLocked());
        diary.unlock("password");
        assertFalse(diary.isLocked());
        diary.createEntry("title","body");
        diary.createEntry("title","body");
        assertEquals(2,diary.getNumberOfEntry());


    }

    @Test
    public void createTwoDiary_findFirstEntry(){
        diary.lockDiary();
        assertTrue(diary.isLocked());
        diary.unlock("password");
        assertFalse(diary.isLocked());
        diary.createEntry("title","body");
        diary.createEntry("tile","body");
        Entry firstEntry = diary.findEntryById(1);
        assertEquals(firstEntry,diary.findEntryById(1));
        assertEquals(2,diary.getNumberOfEntry());

    }

    @Test
    public void createTwoEntry_findThirdEntry_throwInvalidEntryIdException(){
        diary.lockDiary();
        assertTrue(diary.isLocked());
        diary.unlock("password");
        assertFalse(diary.isLocked());
        diary.createEntry("title","body");
        diary.createEntry("title","body");
        assertThrows(InvalidEntryIdException.class,()->diary.findEntryById(3));
        assertEquals(2,diary.getNumberOfEntry());

    }

    @Test
    public void createTwoThirdEntry_findSecondEntry_deleteSecondEntry(){
        diary.lockDiary();
        assertTrue(diary.isLocked());
        diary.unlock("password");
        assertFalse(diary.isLocked());
        diary.createEntry("title","body");
        diary.createEntry("title","body");
        diary.createEntry("title","body");
        Entry secondEntry = diary.findEntryById(2);
        assertEquals(secondEntry,diary.findEntryById(2));
        diary.deleteEntry(2);
        assertEquals(2,diary.getNumberOfEntry());
    }

   @Test
    public void createThreeEntry_deleteFourthEntry_throwInvalidEntryId(){
       diary.lockDiary();
       assertTrue(diary.isLocked());
       diary.unlock("password");
       assertFalse(diary.isLocked());
       diary.createEntry("title","body");
       diary.createEntry("title","body");
       diary.createEntry("title","body");
       assertThrows(InvalidEntryIdException.class,()->diary.deleteEntry(4));
       assertEquals(3,diary.getNumberOfEntry());

   }

   @Test
    public void diaryCanUpdateEntry_newEntryIsUpdated(){
       diary.lockDiary();
       assertTrue(diary.isLocked());
       diary.unlock("password");
       assertFalse(diary.isLocked());
       diary.createEntry("title","body");
       diary.updateEntry(1,"new title","new body");
       Entry foundEntry = diary.findEntryById(1);
       assertEquals("new title",foundEntry.getTitle());
       assertEquals("new body",foundEntry.getBody());

   }




}
