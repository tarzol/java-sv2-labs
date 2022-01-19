package lambdaintro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsedCar {

    private List<Car> cars = new ArrayList<>();

    public UsedCar(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> listCarsByPrices() {
        List<Car> result = new ArrayList<>(cars);
        result.sort((car, anotherCar) -> Integer.valueOf(car.getPrice()).compareTo(anotherCar.getPrice()));
        return result;
    }

    public List<Car> listCarsByLengthDesc() {
        List<Car> result = new ArrayList<>(cars);
        result.sort((car, anotherCar) -> Integer.valueOf(anotherCar.getLength()).compareTo(car.getLength()));
        return result;
    }

    public List<Car> listCarsOneBrandByType(String brand) {

        List<Car> filteredCars = filterCars(brand);

        filteredCars.sort((car, anotherCar) -> car.getType().compareTo(anotherCar.getType()));
        return filteredCars;
    }

    private List<Car> filterCars(String brand) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car actual : cars ) {
            if (actual.getBrand().equals(brand)) {
                filteredCars.add(actual);
            }
        }
        return filteredCars;
    }
}
