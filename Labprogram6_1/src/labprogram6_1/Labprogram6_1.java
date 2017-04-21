/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprogram6_1;

import java.util.Scanner;

/**
 *
 * @author Monish De
 */
public class Labprogram6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary string ");
        String bin = scanner.next();
        System.out.println("The equivalent decimal number from binary "+bin+" is "+Integer.parseInt(bin,2));
        
        // TODO code application logic here
    }
    
}
