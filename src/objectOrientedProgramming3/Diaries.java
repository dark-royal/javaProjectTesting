package objectOrientedProgramming3;

import java.util.ArrayList;
import java.util.List;

public class Diaries {

    private final List<Diary> diaries = new ArrayList<>();


    public void addDiary(String userName, String password) {
        Diary diary = new Diary(userName, password);
        diaries.add(diary);
    }

    public int getNumberOfDiaries() {
        return getDiary().size();
    }

    public List<Diary> getDiary() {
        return diaries;
    }

    public Diary findByUserName(String userName) {
        for (Diary diary : diaries) if (diary.getUserName().equals(userName)) {
            return diary;
        }
        throw new NoSuchDiaryExistException("Diary not found");

    }

    public void delete(String userName, String password) {
        Diary deleteDiary = findByUserName(userName);
        if (deleteDiary != null && deleteDiary.getUserName().equals(userName) && deleteDiary.getPassword().equals(password)) {
            diaries.remove(deleteDiary);
        }
        else{
                throw new NoSuchDiaryExistException("diary not found");
            }


    }
}











