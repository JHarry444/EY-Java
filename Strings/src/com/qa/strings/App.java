package com.qa.strings;

public class App {

    public static void main(String[] args) {

        // Equality
        System.out.println("Jordan" == "Jordan");
        System.out.println("Jordan" == "jordan");
        System.out.println("Jordan".toLowerCase());
        System.out.println("Jordan".toLowerCase() == "jordan");


        System.out.println(new Dog("Fido", 12, "bulldog") == new Dog("Fido", 12, "bulldog"));

        Dog d = new Dog("Fido", 12, "bulldog");

        System.out.println(d == d);

        System.out.println("Jordan".toLowerCase().equals("jordan"));
        System.out.println(new Dog("Fido", 12, "bulldog").equals(new Dog("Fido", 12, "bulldog")));

        System.out.println("JoRdAn".toLowerCase());
        System.out.println("JoRdAn".toUpperCase());

        String name = "jordan harrison";
        System.out.println("Char at 0: " + name.charAt(0));
        System.out.println("Last char: " + name.charAt(name.length() - 1));

        System.out.println(name.indexOf(" "));
        System.out.println("Initials: " + name.charAt(0) + name.charAt(name.indexOf(" ") + 1));
        String surname = name.substring(name.indexOf(" ") + 1);
        System.out.println("Surname: " + surname);

        String[] names = name.split(" ");
        System.out.println(names[0]);
        System.out.println(names[1]);

        String[] posSplit = {name.substring(0, name.indexOf(" ")), name.substring(name.indexOf(" ") + 1)};
        System.out.println(posSplit[0]);
        System.out.println(posSplit[1]);

        System.out.println(name.contains("j"));
        System.out.println(name.contains("h"));
        System.out.println(name.contains("dan"));
    }
}
