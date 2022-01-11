package collectionslist;

import java.time.LocalDate;

public class Food {

    private String name;
    private LocalDate localdate;

    public Food(String name, LocalDate localdate) {
        this.name = name;
        this.localdate = localdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocaldate(LocalDate localdate) {
        this.localdate = localdate;
    }

    public LocalDate getLocaldate() {
        return localdate;
    }
}
