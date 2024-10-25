package October.ex_16102024;

import java.util.Scanner;

public class Lab063_Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name :");
        String name = scanner.nextLine();

        System.out.println("Enter your Age :");
        int age = scanner.nextInt();

        System.out.println("Enter your Salary :");
        float salary = scanner.nextFloat();

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
        scanner.close();
    }
}
