package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        message = message + "444";
        Boolean b = message.equals("John Doe");
        Boolean c = message.equals("Hello John Doe444");

        System.out.println("Prefix: "+prefix);
        System.out.println("Name: "+name);
        System.out.println("Message: "+message);
        System.out.println("b: "+b);
        System.out.println("c: "+c);

        String string1 = "";
        String string2 = "";
        String string3 = string1 + string2;
        System.out.println(("Stringek hossza:"+string3.length()));

        String string4 = "Abcde";
        System.out.println("Az Abcde String hossza: "+string4.length());
        System.out.println("Első és harmadik karakter: "+string4.substring(0,1)+","+string4.substring(2,3));
        System.out.println("Az első három karakter: "+string4.substring(0,3));

    }
}
