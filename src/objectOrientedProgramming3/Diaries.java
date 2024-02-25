package objectOrientedProgramming3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Diaries {

    private List<Diary> diaries = new ArrayList<>();


    public void addDiary(String userName, String password) {
        Diary diary = new Diary("user name", "password");
        diaries.add(diary);
    }

    public List<Diary> getDiary() {
        return diaries;
    }

    public Diary findByUserName(String userName) {
        for (Diary diary : diaries) if (diary.getUserName().equals(userName)) return diary;
        throw new NoSuchDiaryExistException("Diary not found");

        }

    public void delete(String userName, String password){
        var deleteDiary = findByUserName(userName);
        if(deleteDiary.validatePassword(password)) {
            diaries.remove(deleteDiary);
        }
    }

    }











