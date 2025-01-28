public class Conditionals {
    public static void main(String[] args) {
        int i = 5;

        if (i % 2 == 0) {
            System.out.println("IS EVEN");
        } else {
            System.out.println("IS ODD");
        }

        if (i % 2 == 0 && i > 10) {
            System.out.println("IS EVEN AND GREATER THAN TEN");
        } else if (i %  2 == 0 || i > 10) {
            System.out.println("IS EVEN OR GREATER THAN TEN");
        } else {
            System.out.println("IS NEITHER EVEN NOR GREATER THAN TEN");
        }
        boolean b = true;
        if (b) { // SAYING b is true
            System.out.println("B is true");
        } else {
            System.out.println("B is false");
        }

        int dayOfWeek = 5;
        switch (dayOfWeek) { // string, numbers and enums
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
                break; // stops the switch from cascading past this case
            default:
                System.out.println("That's not a day");
        }
    }
}