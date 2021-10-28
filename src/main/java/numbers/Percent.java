package numbers;

public class Percent {
    public double getValue (int number1, int number2) {
        double result;
        result = (double) number1 * number2/100;
        return result;
    }

    public double getBase (int number1, int number2) {
        double result;
        result = (double) number1 / number2 * 100;
        return result;
    }

    public double getPercent(int number1, int number2) {
        double result;
        result = (double) number2 / number1 * 100;
        return result;
    }

    public static void main(String[] args) {
        Percent percent = new Percent();
        System.out.println("Egész számos osztás - vissza double: "+percent.getValue(100, 30));

        System.out.println("Minek a százaléka? "+percent.getBase(60, 30));

        System.out.println("Elsőnek hány százaléka a második? "+percent.getPercent(20, 10));
    }
}
