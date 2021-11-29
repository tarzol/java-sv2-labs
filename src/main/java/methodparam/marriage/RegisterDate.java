package methodparam.marriage;

import java.time.LocalDate;

public class RegisterDate {
    private String description;
    private LocalDate date;

    public RegisterDate(String description, LocalDate date) {
        this.description = description;
        this.date = date;
    }

    public void RegisterDate(String házasságkötés, LocalDate now) {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
