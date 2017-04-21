/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Monish De
 */
public class Lab8_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            System.out.println("1. To demonstrate \"throw\"\n2. To demonstrate "
                    + "\"throws\"\n3. To demonstrate normal try-catch\n Press "
                    + "any other key to move the control to finally block");
            System.out.println("Enter Choice");
            Scanner s = new Scanner(System.in);
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    int age = 17;
                    if (age < 18) {
                        throw new IOException("NOT VALID TO VOTE");
                    }
                    break;

                case 2:
                    test();
                    break;

                case 3:
                    int a = 10;
                    int b = 0;
                    int c = a / b;
                    break;

            }

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program executed without any error");
        }
    }

    public static void test() throws ArrayIndexOutOfBoundsException {

        int[] arr = new int[5];
        System.out.println(arr[5]); //Exception ArrayIndexOutOfBoundsException        
    }

}
