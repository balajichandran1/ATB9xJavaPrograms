package October.ex_17102024;

import java.util.Scanner;

public class Lab073_Task1_HackerQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Mark: ");
        int score = sc.nextInt();

        if(score >= 90 && score <=100) {
            System.out.println("Your Grade is A");
        } else if (score >= 80 && score <=89) {
            System.out.println("Your Grade is B");
        } else if (score >= 70 && score <=79) {
            System.out.println("Your Grade is C");
        } else if (score >= 60 && score <=69) {
            System.out.println("Your Grade is D");
        } else if (score >= 0 && score <=59){
            System.out.println("Your Grade is E");
        } else {
          System.out.println("Invalid mark, please enter between 1 and 100");
        }
        sc.close();
    }
}
