package notifications;

import java.util.Scanner;

public class notifications{
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    Integer words;

    System.out.println("Would you like to try and enter the system...");
    System.out.println("Enter 1 for yes, 2 for no");
    words = sc.nextInt();

    if (words == 1){
        System.out.println("An unothorized entry has been detected...");
    } else {
        System.out.println("System is secured");
    }
    

}
}