package October.ex_18102024;

import java.util.Scanner;

public class Lab031_SwitchAnotherSample {
    // Switch Condition
    // User - Enter String - Day From Sunday to Saturday
    // Which day it is it
    // 1 -> Sunday, 2 -> Monday, 7 -> Saturday and 8,9,10....-1 -> Invalid inputs
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the day between Sunday to Saturday: ");

        String day = sc.nextLine();
        switch (day){
            case: "1";
                System.out.println("Monday");

                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            case 7:
                System.out.println("7");
                break;
            default:
                System.out.println("No idea, what day it is");
                break;
        }

        System.out.println("End of the Loop");
        sc.close();


    }

}
