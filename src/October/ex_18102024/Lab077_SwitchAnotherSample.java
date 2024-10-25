package October.ex_18102024;

import java.util.Scanner;

public class Lab077_SwitchAnotherSample {
    // Switch Condition
    // User - Enter String - Day From Sunday to Saturday
    // Which day it is it
    // 1 -> Monday, 2 -> Tuesday, 7 -> Sunday and Holiday -> Invalid inputs
       public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the day between Sunday to Saturday: ");

        String day = sc.next();
     //  day = day.toLowerCase();
       // day = day.toUpperCase();

        switch (day){

            case "Monday":
                System.out.println(1);
                break;
            case "Tuesday":
                System.out.println(2);
                break;
            case "Wednesday":
                System.out.println(3);
                break;
            case "Thursday":
                System.out.println(4);
                break;
            case "Friday":
                System.out.println(5);
                break;
            case "Saturday":
                System.out.println(6);
                break;
            case "Sunday":
                System.out.println(7);
                break;
            default:
                System.out.println("No idea, what day it is");
                break;
        }

        System.out.println("End of the Loop");
        sc.close();

    }

}


