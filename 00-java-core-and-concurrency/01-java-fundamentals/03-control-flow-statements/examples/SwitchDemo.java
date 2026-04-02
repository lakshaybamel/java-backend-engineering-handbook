public class SwitchDemo {
    public static void main(String[] args) {

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // Switch with String
        String role = "admin";

        switch (role) {
            case "admin":
                System.out.println("Full access");
                break;
            case "user":
                System.out.println("Limited access");
                break;
            default:
                System.out.println("Unknown role");
        }
    }
}