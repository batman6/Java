/*
2. Write a program that generates a random number and asks the user to guess what the number is. If the user's guess is higher than the random number, the program should display 
"Too high, try again." If the user's guess is lower than the random number, the program should display "Too low, try again." The program should use a loop that repeats until the 
user correctly guesses the random number.
 
 */
package tohightolow;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Monish De
 */
public class ToHighToLow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Random random = new Random ();
        System.out.println("Enter NUMBERS between 1-10 ");
        int n = random.nextInt(10)+1;
        for(int i=0;i<=10;i++){
            int choice = scanner.nextInt(); 
            if(choice>n){
                System.out.println("Too HIGH");
                continue;
            }
            else if(choice<n){
               System.out.println("Too LOW");
               continue;
            }
            else if(choice==n)
                System.out.println("Correct");
                break;
                
        }
        
        // TODO code application logic here
    }
    
}
