package October.ex_16102024;

public class Lab064_Task2 {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int maxValue = (num1 > num2) ? num1 : num2 ;
        System.out.println(maxValue);

        }
}
