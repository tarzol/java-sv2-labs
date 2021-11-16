package introcontrol;

public class IntroControl {

    public int subtractTenIfGreaterThanTen(int number) {
        if (number > 10) {
            number -= 10;
            return number;
        }
        return number;
    }

    public String describeNumber(int number) {
        if (number == 0) {
            return "zero";
        } else
        {
            return "not zero";
        }
    }

}
