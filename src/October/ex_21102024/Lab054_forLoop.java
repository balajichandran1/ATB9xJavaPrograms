package October.ex_21102024;

public class Lab054_forLoop {
    public static void main(String[] args) {
        for(int i = 0; i <10; i++){
            if (i==5){
                System.out.println("Five");
            }else {
                System.out.println(i); //output will be 0,1,2,3,4,Five,6,7,8,9
            }
        }
    }
}
