package October.ex_18102024;

import java.util.Scanner;

public class Lab076_Switch {
    // Switch Condition
    // User - Enter int number from 1 to 7
    // Which day it is it
    // 1 -> Sun, 2 -> Mon, 7 -> Sat and 8,9,10....-1 -> Invalid inputs
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the day between 1 and 7: ");

        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("No idea, what day it is");
                break;
        }

        System.out.println("End of the Loop");
        sc.close();


    }

}
