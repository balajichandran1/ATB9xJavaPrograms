package October.ex_15102024;

public class Lab014_Task2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        // exp 1 -> ++a -> 11 ; a = 11
        // exp 2 -> a++ -> 11 ; a = 12
        // exp 3 -> a++ -> 12 ; a = 13
        // exp 1 + exp 2 + exp 3 -> 11 + 11 + 12 = 34
        System.out.println(a);
        // now a is 13 so the answer will be 34 and 13
    }
}
