public class LoopsDemo {
    public static void main(String[] args) {

        // For loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // While loop
        System.out.println("\nWhile Loop:");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // Do-while loop
        System.out.println("\nDo-While Loop:");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);
    }
}