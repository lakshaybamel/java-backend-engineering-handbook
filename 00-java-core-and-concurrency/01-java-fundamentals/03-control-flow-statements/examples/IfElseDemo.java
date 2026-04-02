public class IfElseDemo {
    public static void main(String[] args) {

        int age = 20;

        // Simple if-else
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible");
        }

        // Else-if ladder
        int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        // Nested if
        boolean hasID = true;

        if (age >= 18) {
            if (hasID) {
                System.out.println("Allowed entry");
            }
        }
    }
}