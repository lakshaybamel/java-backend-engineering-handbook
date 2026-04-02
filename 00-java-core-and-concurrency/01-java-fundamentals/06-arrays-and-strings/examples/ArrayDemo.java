public class ArrayDemo {
    public static void main(String[] args) {

        // Declaration and initialization
        int[] arr = {10, 20, 30, 40, 50};

        // Accessing elements
        System.out.println("First element: " + arr[0]);
        System.out.println("Third element: " + arr[2]);

        // Traversing using for loop
        System.out.println("\nUsing for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Traversing using enhanced for loop
        System.out.println("\nUsing enhanced for loop:");
        for (int num : arr) {
            System.out.println(num);
        }
    }
}