package interfacedependencyinversion.amount;

public class Amount implements Payable{

    @Override
    public int getPayableAmount(int amount) {
        return amount;
    }

    public static void main(String[] args) {
        Payable payable1 = new Amount();
        System.out.println(payable1.getPayableAmount(1000));
    }
}
