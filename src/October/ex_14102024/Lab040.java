package October.ex_14102024;

public class Lab040 {
    public static void main(String[] args) {
        // Type Casting -
        // Widening - Implicit, Explicit - lossless
        // Narrowing - Implicit, Explicit(with data type), loss

        // Widening
        byte b = 10;
        int a = b; // Valid -> Implicit Casting - JVM
        int a1 = (int) b; // Valid -> Explicit Casting - JVM

        // Narrowing - Converting - Large data type - small
        int val = 200;
        //byte b2 = val; // Invalid - Implicit - JVM
        byte b3 = (byte) val; // Valid -> Explicit - User

        //long phone_no = 9876543210l;
        // short s = phone_no; // Implict - JVM
        //        short s = (short)phone_no; // Explicit - User - Loss that data
    }
}
