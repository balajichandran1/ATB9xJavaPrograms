package October.ex_21102024;

public class Lab056_forLoopwithBreak {
    public static void main(String[] args) {
        //Break and For Loop
        for (int i = 0; i<50;i++) {
            if(i==5){ //if i becomes 5, then there will be a break and stop of the execution or print
                break;
            }
            System.out.println(i); // output will 0,1,2,3,4
        }
    }
}
