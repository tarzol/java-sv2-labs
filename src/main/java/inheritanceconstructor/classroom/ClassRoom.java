package inheritanceconstructor.classroom;

public class ClassRoom extends Room{
    Facility facility;

    public ClassRoom(String location, int capacity, Facility facility) {
        super(location, capacity);
        this.facility = facility;
    }

    public boolean isSuitable() {
        return true;
    }

    public Facility getFacility() {
        return facility;
    }
}

