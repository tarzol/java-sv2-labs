package interfacestaticmethods.vehicle;

public interface Vehicle {

    static Vehicle of(int numberOfWheels) {
        if (numberOfWheels == 2) {
            return new Bicycle(2);
        } else if (numberOfWheels == 4 ) {
            return new Car(4);
        } else  {
            throw new IllegalArgumentException("A megadott kerékszám nem megfelelő!");
        }
    }
}
