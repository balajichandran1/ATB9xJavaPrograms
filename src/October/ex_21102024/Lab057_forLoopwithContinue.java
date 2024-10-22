package October.ex_21102024;

public class Lab057_forLoopwithContinue {
    public static void main(String[] args) {
        for (int i  = 0 ; i < 50; i++){
            if(i==5){
                continue; // Skip the below code and move to top
            }
            System.out.println(i); // this will print 0, 1,2,3,4,6,7..49 --> 5 will not be printed
        }
    }
}
