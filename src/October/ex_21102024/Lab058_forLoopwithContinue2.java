package October.ex_21102024;

public class Lab058_forLoopwithContinue2 {
    public static void main(String[] args) {
        for(int i=0; i <= 50; i++){
         if (i%2 == 0){
             System.out.println("The number is Even" + i);
             continue;
         }
         System.out.println(i);
        }
    }
}
