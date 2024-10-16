package October.ex_15102024;

public class Lab015_Task3 {
    public static void main(String[] args) {

        int a = 20;
        System.out.println(--a + a++ + a--);
        // exp 1 -> -- a -> 19 ; a = 19
        // exp 2 -> a++ -> 19 ; a = 20
        // exp 3 -> a-- -> 20 ; a = 19
        System.out.println(a);

    }


}
