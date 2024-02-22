package objectOrientedProgramming3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static java.lang.String.format;

public class Entry {

    private int id;
    private String title;
    private String body;
    private LocalDate dateCreated;
    private LocalTime time;


    public Entry(int id,String title,String body){
        this.id = id;
        this.title = title;
        this.body = body;
        this.dateCreated = LocalDate.now();
        this.time = LocalTime.parse(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));

    }


    public  void setId(int id){
        this.id = id;
    }

    public void setBody(String body){
        this.body = body;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public LocalTime getTime() {
        return time;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public String toString(){
        return id + " " + title + " " + body + " " + dateCreated + " " + time;
    }
}
