package October.ex_18102024;

import java.util.Scanner;

public class Lab033_SwitchBrowserSample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the browser");

        String browser = sc.next();
        browser = browser.toLowerCase();

        switch (browser){
            default:
                System.out.println("I have not idea which browser is this");
                break;
            case "chrome":
                System.out.println("Starting the chrome browser");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                break;
            case "internetexplorer":
                System.out.println("Starting the internet explorer browser");
                break;
        }
    }
}
