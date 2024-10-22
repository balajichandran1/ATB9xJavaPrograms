package October.ex_21102024;

public class Lab055_forLoop_OddorEven {
    public static void main(String[] args) {
        for (int i = 0 ; i<=50; i++){
            if (i%2 == 0){
                System.out.println( "Number is Even" + i);
            } else {
                System.out.println("Number is odd" + i);
            }
        }
    }
}
