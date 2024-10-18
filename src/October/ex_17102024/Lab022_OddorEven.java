package October.ex_17102024;

import java.util.Scanner;

public class Lab022_OddorEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number, I will tell you odd or even: ");
        int num = sc.nextInt();

        // Modulus -> %
        //   10%2 == Even -> 0
        //   10%2 == Odd -> 1

        if(num%2 == 0) {
            System.out.println("The number is Even");
        }else {
            System.out.println("The number is Odd");
        }
        sc.close();
    }
}
