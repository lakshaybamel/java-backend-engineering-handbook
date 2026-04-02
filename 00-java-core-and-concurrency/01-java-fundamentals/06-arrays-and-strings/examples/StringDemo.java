public class StringDemo {
    public static void main(String[] args) {

        // String creation
        String s1 = "Hello";
        String s2 = new String("Hello");

        // String comparison
        System.out.println("Using == : " + (s1 == s2));        // false
        System.out.println("Using equals(): " + s1.equals(s2)); // true

        // String immutability
        String s = "Java";
        s = s + " Programming";
        System.out.println("Updated String: " + s);

        // String methods
        String str = "OpenAI";

        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Character at index 2: " + str.charAt(2));
        System.out.println("Substring: " + str.substring(2));

        // StringBuilder example
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");

        System.out.println("StringBuilder: " + sb);
    }
}