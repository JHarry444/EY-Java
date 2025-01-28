// use PascalCase for classes
public class Main {
    public static void main(String[] args) {
        // Type name = value;
        String name = "Jordan";

        var a  = 27;
        var b = "YO!";
//        a = "Hello"; variables in java cannot change value after creation
        var var = "gsdngfd";

//        String static = "ffdgd";

        var var2 = "fgdsgd";
//        var 2var = "rgdgdg";

        // use camelCase for variables and functions to make them easier to read
        String myfirstnameandlastname = "Jordan Harrison";
        String myFirstNameAndLastName = "Jordan Harrison";

        int age = 30;
        System.out.println("Age: " + age);
        age = 31;
        System.out.println("Age: " + age);

//        Person person = new Person();
//
//        person.name = "Jordan";
//        person.name = "Cameron";
//


        final double PI = 3.142;

//        PI = 3424234; can't reassign finals (=)

        System.out.println("Byte: " + Byte.MAX_VALUE);
        System.out.println("Short: " + Short.MAX_VALUE);
        System.out.println("Int: " + Integer.MAX_VALUE);
        System.out.println("Long: " + Long.MAX_VALUE);

        byte byt = 120;

        short s = 3424;

        int i = 434234234;

        long l = 43424432534535L;

        float f = 3424.234234F;

        double d = 323424.534535345;

        boolean bool= true;

        char c = 't';

        String string = "gfdgdfg";

        System.out.println("a + a: " +('a' + 'a'));

        System.out.println("79 / 10 = " + 79 / 10);
        System.out.println("79.0 / 10 = " + 79.0 / 10);

        System.out.println(10 > 5);
        System.out.println(10 < 5);
        System.out.println(10 >= 5);
        System.out.println(10 <= 5);
        System.out.println(10 == 5);
        System.out.println(10 != 5);
    }
}