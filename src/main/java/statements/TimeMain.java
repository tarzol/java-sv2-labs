package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {

        int hour;
        int minute;
        int second;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg az első időpont óraját: ");
        hour = scanner.nextInt();

        System.out.println("Add meg az első időpont percét: ");
        minute = scanner.nextInt();

        System.out.println("Add meg az első időpont másodpercét: ");
        second = scanner.nextInt();

        System.out.println("A megadott időpont: "+hour+" óra "+minute+" perc "+second+ "mp");
        Time time1 = new Time(hour,minute,second);
        System.out.println(time1.getInMinutes());

        System.out.println("Add meg a második időpont óraját: ");
        hour = scanner.nextInt();

        System.out.println("Add meg a második időpont percét: ");
        minute = scanner.nextInt();

        System.out.println("Add meg a második időpont másodpercét: ");
        second = scanner.nextInt();

        System.out.println("A megadott időpont: "+hour+" óra "+minute+" perc "+second+ "mp");
        Time time2 = new Time(hour,minute,second);

        System.out.println("Az első: "+time1.getInMinutes());
        System.out.println("A második: "+time2.getInMinutes());

        System.out.println(time1.toString());

        System.out.println(time1.getInSeconds()<time2.getInSeconds() ? "Első időpont" : "Második időpont");
    }
}
