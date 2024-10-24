package October.ex_11102024;

public class Lab026 {
    public static void main(String[] args) {

        String first_name = "Balaji";
        String last_name = "Chandran";
        int a = 10;
        int b = 10;
        System.out.println(first_name + last_name + a + b);
        // BalajiChandran1010 - first operator - + performed as Concatenation
        System.out.println(a + b + first_name + last_name);
        // First + math -> 20BalajiChandran

        System.out.println(first_name + last_name + (a + b));
        // BODMAS -
    }
}
