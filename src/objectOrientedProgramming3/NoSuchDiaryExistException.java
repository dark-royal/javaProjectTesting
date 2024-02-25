package objectOrientedProgramming3;

public class NoSuchDiaryExistException extends RuntimeException {
    public NoSuchDiaryExistException(String diaryNotFound) {
        super(diaryNotFound);
    }
}
