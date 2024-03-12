package objectOrientedProgramming3;

import java.util.ArrayList;
import java.util.List;

public class Diary {

    private String userName;
    private String password;
    private int id;
    private boolean isLocked = true;
    private List<Entry> entries;


    public Diary(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.entries = new ArrayList<>();
    }
    public String getUserName(){
        return userName;
    }

    public String getPassword(){
        return password;
    }


    public boolean isLocked() {
        return isLocked;
    }

    public void unlock(String password) {
        validatePassword(password);
        isLocked = false;


    }

    public void lockDiary() {
        isLocked = true;
    }

    public void validatePassword(String password) {
        if (!(this.password.equals(password)))
            throw new InvalidPassWordException("invalid password,try again");
    }

    public void createEntry(String title, String body){
        if(isLocked()){
            System.out.println("diary is locked");
        }
        else {
            int id = generateId();
            Entry entry = new Entry(id, "title", "body");
            entries.add(entry);

        }
    }

    private int generateId() {
        id++;
        return id;
    }


    public int getNumberOfEntry() {
        return entries.size();
    }

    public Entry findEntryById(int id) {
        for (Entry entry : entries) {
            if (entry.getId() == id) {
                return entry;
            }
        }
            throw new InvalidEntryIdException("entry not found");

    }

    public void deleteEntry(int id) {
        Entry entry = findEntryById(id);
        entries.remove(id);
    }

    public void updateEntry(int id,String title,String body) {
        for (Entry entry:entries){
            if(entry.getId() == id){
                entry.setTitle(title);
                entry.setBody(body);

            }
        }



    }


}




