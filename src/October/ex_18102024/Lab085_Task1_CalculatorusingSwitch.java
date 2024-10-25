package October.ex_18102024;

import java.util.Scanner;

public class Lab085_Task1_CalculatorusingSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" 1 - Add 2 - Subtraction 3 - Multiply  4 - Divide 5 - Modulus");

        System.out.println("Choose the operator: ");
        int operator = sc.nextInt();

        System.out.println("Enter the number 1:");
        int num1 = sc.nextInt();

        System.out.println("Enter the number 2:");
        int num2 = sc.nextInt();

        int result = 0;

        switch (operator){

            case 1:
                result = num1 + num2;
                break;

            case 2:
                result = num1 - num2;
                break;

            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            case 5:
                result = num1 % num2;
                break;
            default:
                System.out.println("Entered operator is invalid");
        }

        System.out.println("Result is :" + result);
    }
}
