package collectionsqueue;

import java.util.PriorityQueue;

public class ToDo {
    private String description;
    private boolean urgent;

    public ToDo(String description, boolean urgent) {
        this.description = description;
        this.urgent = urgent;
    }

    public String getDescription() {
        return description;
    }

    public boolean isUrgent() {
        return urgent;
    }
}
