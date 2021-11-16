package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {

        IntroControl introControl = new IntroControl();
        System.out.println(introControl.subtractTenIfGreaterThanTen(12));
        System.out.println(introControl.subtractTenIfGreaterThanTen(2));

        System.out.println(introControl.describeNumber(0));
        System.out.println(introControl.describeNumber(22));
    }
}
