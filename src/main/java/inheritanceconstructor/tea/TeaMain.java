package inheritanceconstructor.tea;

public class TeaMain {
    public static void main(String[] args) {
        Tea tea = new Tea("Ceylon", 500);
        Herbal herbal = new Herbal("Mályva", 600);
        System.out.println("Tea: "+tea.getName()+", ár: "+tea.getPrice());
        System.out.println("Herbal: "+herbal.getName()+", ár: "+herbal.getPrice());
    }
}
