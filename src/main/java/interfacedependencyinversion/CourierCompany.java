package interfacedependencyinversion;

public class CourierCompany {

    public static void main(String[] args) {

        Box box1 = new SmallBox();
        Box box2 = new MediumBox();
        Box box3 = new LargeBox();
        Box box4 = new ExtraLargeBox();

        System.out.println(("Small box: "+box1.getSize()+" "+box1.getPrice()));
        System.out.println(("Small box: "+box2.getSize()+" "+box2.getPrice()));
        System.out.println(("Small box: "+box3.getSize()+" "+box3.getPrice()));
        System.out.println(("Small box: "+box4.getSize()+" "+box4.getPrice()));
    }
}
