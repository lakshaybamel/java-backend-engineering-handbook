public class BreakContinueDemo {
    public static void main(String[] args) {

        // Break example
        System.out.println("Break Example:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }

        // Continue example
        System.out.println("\nContinue Example:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}