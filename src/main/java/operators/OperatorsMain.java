package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(10));

        Operators op = new Operators();
        System.out.println("páros? "+op.isEven(5));

        System.out.println("Osztás után maradék"+op.getResultOfDivision(9,4));

        System.out.println("Null értékű? "+op.isNull(null));
        System.out.println("Null értékű? "+op.isNull("nem null"));

        System.out.println("Üres a string? "+"nem üres"+op.isEmpty("nem üres"));
        System.out.println("Üres a string? "+"üres"+op.isEmpty(""));
        System.out.println("Üres a string? "+"null"+op.isEmpty(null));
    }
}
