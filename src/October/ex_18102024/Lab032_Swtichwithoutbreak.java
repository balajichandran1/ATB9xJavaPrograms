package October.ex_18102024;

import java.util.Scanner;

public class Lab032_Swtichwithoutbreak {

    public static void main(String[] args) {

        // Switch Condition
        // User - Enter int number from 1 to 7
        // Which day it is it
        // 1 -> Sun, 4 -> thur, 7 -> sun, 8,9,10....-1 -> Invalid
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from (1-7)");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Sunday");
            case 2:
                System.out.println("Monday");
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
            case 5:
                System.out.println("Thursday");
            case 6:
                System.out.println("Friday");
            case 7:
                System.out.println("Saturday");
            default:
                System.out.println("No idea, what day it is");
        }

        System.out.println("End of the Loop");
        sc.close();


    }



}
