package October.ex_18102024;

import java.util.Scanner;

public class Lab086_Task2_FindinMonth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number between 1 and 12:");

        int month = sc.nextInt();

        switch (month){
            case 1:
                System.out.println("Respective month is January");
                break;
            case 2:
                System.out.println("Respective month is February");
                break;
            case 3:
                System.out.println("Respective month is March");
                break;
            case 4:
                System.out.println("Respective month is April");
                break;
            case 5:
                System.out.println("Respective month is May");
                break;
            case 6:
                System.out.println("Respective month is June");
                break;
            case 7:
                System.out.println("Respective month is July");
                break;
            case 8:
                System.out.println("Respective month is August");
                break;
            case 9:
                System.out.println("Respective month is September");
                break;
            case 10:
                System.out.println("Respective month is October");
                break;
            case 11:
                System.out.println("Respective month is November");
                break;
            case 12:
                System.out.println("Respective month is December");
                break;
            default:
                System.out.println("Invalid input, cannot say the month");
        }
        sc.close();
    }
}
