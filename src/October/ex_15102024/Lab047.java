package October.ex_15102024;

public class Lab047 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a); //  A  -> a++  , B  - a
        // A+B
        // A -> a++ -> 10 ->  a = 11
        // B - a -> 11
        // A +B -> 10+11

        // Line No. |  a |  Exp
        // 5        |  10 | NA
        // 6       | 11 | 10 + 11 |

    }
}
