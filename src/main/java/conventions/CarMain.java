package conventions;

public class CarMain {

    public static void main(String[] args) {
        Car car1 = new Car("citroen","diesel",5,5);
        Car car2 =new Car("Hyundai","diesel",5,5);

        System.out.println("Típus: "+car1.getCarType());
        System.out.println("Az első autó jellemzői:");
        System.out.println("Típus: "+car1.getCarType());
        System.out.println("Motor: "+car1.getEngineType());

        car1.setCarType("Volkswagen");
        System.out.println("Az első autó új típusa: "+car1.getCarType());

        car2.setCarType("Volvo");
        car2.setEngineType("benzin");
        System.out.println("A második autó adatai: "+"Típus: "+ car2.getCarType()+"   Motor:  "+car2.getEngineType());

        car2.setCarType("Hyundai");
        car2.addModelName("IX35");
        System.out.println("A második autó modelljének neve: "+car2.getCarType());
        System.out.println("Brand and type name: "+car2.getBrandAndTypeInSeparateLines("Volvo","XC60"));
    }
}


