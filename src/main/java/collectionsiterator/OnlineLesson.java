package collectionsiterator;

import java.time.LocalDateTime;

public class OnlineLesson {
    private String name;
    private String nameOfLesson;
    private LocalDateTime localDateTime;

    public OnlineLesson(String name, String nameOfLesson, LocalDateTime localDateTime) {
        this.name = name;
        this.nameOfLesson = nameOfLesson;
        this.localDateTime = localDateTime;
    }

    public String getName() {
        return name;
    }

    public String getNameOfLesson() {
        return nameOfLesson;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}
