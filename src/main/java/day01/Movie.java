package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    List<LocalDateTime> timeOfAvail = new ArrayList<>();

    public Movie(String title, List<LocalDateTime> timeOfAvail) {
        this.title = title;
        this.timeOfAvail = timeOfAvail;
    }
}
