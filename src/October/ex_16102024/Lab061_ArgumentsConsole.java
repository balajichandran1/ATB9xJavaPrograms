package October.ex_16102024;

public class Lab061_ArgumentsConsole {

    public static void main(String[] args) {
        // Create a Program to check whether Shesheh Trivedi will go to Goa OR NOT
        // Take a input age = Shesheh ->  Goa
        // age > 25 -> Drinking - Goa
        // Ternary operator

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.printf("%s , %s ,%s", args[0], args[1], args[2]);
        int age = Integer.parseInt(args[1]);
        System.out.println();
        System.out.println(age > 21 ? "Allowed to Goa" : "Not Allowed");
    }
}