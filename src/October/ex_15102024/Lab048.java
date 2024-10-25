package October.ex_15102024;

public class Lab048 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);
        // A -> a++ -> 10 , a-> 11
        //  + ->
        // B  -> ++a -> 12 , a -> 12

        // A+B -> 10+12
    }
}
