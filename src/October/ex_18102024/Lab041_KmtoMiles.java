package October.ex_18102024;

import java.util.Scanner;

public class Lab041_KmtoMiles {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the choice : 1 to Convert Km to Miles and 2 to Convert Celsius to Fahrenheit");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter the Kilometer:");
                double km = sc.nextDouble();
                double miles = (km * 0.621371);
                System.out.printf("The converted value of Kilometer to Miles is : " + miles);
                break;
            case 2:
                System.out.println("Enter Fahrenheit");
                double fahrenheit = sc.nextDouble();
                double celsius = (fahrenheit-32) * 5 / 9;
                System.out.printf("The converted value of Fahrenheit to celsicus is : " + celsius);
                break;
            default:
                System.out.println("Entered choice is invalid");
        }
    }
}
