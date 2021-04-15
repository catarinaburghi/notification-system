package notifications;
/*This program is just to show 
*how a simple notification would
*appear when it notices a unauthorized
*entry to the system.
*/
import java.util.Scanner;

public class notifications{
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    double choice;

    System.out.println("Would you like to try and enter the system...");
    System.out.println("Enter 1 for yes, 2 for no");
    choice = sc.nextDouble();

    if (choice == 1){
        System.out.println("An unothorized entry has been detected...");
    } else {
        System.out.println("System is secured");
    }
    

}
}