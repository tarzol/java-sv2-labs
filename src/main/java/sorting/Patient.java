package sorting;

import java.time.LocalDateTime;

public class Patient {
    private String name;
    private String TAJ;
    private LocalDateTime timeOfMeetingGP;

    public Patient(String name, String TAJ, LocalDateTime timeOfMeetingGP) {
        this.name = name;
        this.TAJ = TAJ;
        this.timeOfMeetingGP = timeOfMeetingGP;
    }

    public String getName() {
        return name;
    }

    public String getTAJ() {
        return TAJ;
    }

    public LocalDateTime getTimeOfMeetingGP() {
        return timeOfMeetingGP;
    }
}
