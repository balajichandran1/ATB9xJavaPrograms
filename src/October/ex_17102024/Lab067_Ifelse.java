package October.ex_17102024;

import java.util.Scanner;

public class Lab067_Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        if(age >= 18)
            {
                System.out.println("Eligible to vote");
            }
        else {
                System.out.println("Not Eligible to vote");
            }

            sc.close();
    }
}
