package October.ex_16102024;

public class Lab065_Task3 {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        int maxValue = (num1 >= num2 && num1 >= num3) ? num1 : (num2 >= num3) ? num2 : num3;
        System.out.println(maxValue);

    }
}
