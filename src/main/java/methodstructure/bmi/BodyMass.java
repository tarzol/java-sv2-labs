package methodstructure.bmi;

import static methodstructure.bmi.BmiCategory.*;

public class BodyMass {

    private int mass;
    private double heightInMeter;

    public BodyMass(int mass, double heightInMeter) {
        this.mass = mass;
        this.heightInMeter = heightInMeter;
    }

    public double getBodyMassIndex(int mass, double heightInMeter) {
        return mass/(heightInMeter*heightInMeter);
    }

    public BmiCategory getBody() {
        BmiCategory bmiCategory = NORMAL;
        if(getBodyMassIndex(mass, heightInMeter) < 18.5) {
            bmiCategory = UNDERWEIGHT;
        } else if (getBodyMassIndex(mass, heightInMeter) > 25) {
            bmiCategory = OVERWEIGHT;
        }
        return bmiCategory;
    }

    public boolean isThinnerThan(BodyMass other) {
        if (getBodyMassIndex(mass, heightInMeter) < getBodyMassIndex(other.getMass(), getHeightInMeter())) {
            return true;
        }
        return false;
    }

    public int getMass() {
        return mass;
    }

    public double getHeightInMeter() {
        return heightInMeter;
    }

    public static void main(String[] args) {
        BodyMass bodyMass = new BodyMass(80, 1.80);
        System.out.println("Test típusa: "+bodyMass.getBody());
        System.out.println("BMI index: "+bodyMass.getBodyMassIndex(90, 1.85));

        BodyMass anotherBodyMass = new BodyMass(120, 1.8);
        System.out.println("Másik személy: "+bodyMass.isThinnerThan(anotherBodyMass));
    }
}
