package October.ex_15102024;

public class Lab013_LargestNumberusingTernaryOperator {
    public static void main(String[] args) {

        int a = 21;
        int b = 22;
        float c = 21.99f;

        float result = (a>=b && a>=c)? a : (b>=c ? b :c);
        System.out.println("The Largest of three number is :" + result);


    }
}
