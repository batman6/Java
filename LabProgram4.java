/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprogram4;

import java.util.Scanner;

/**
 *
 * @author Monish De
 */
public class LabProgram4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter in Decimal Form");
        int num = scanner.nextInt();
        System.out.println("Binary : "+ Integer.toBinaryString(num));
        System.out.println("Hexagonal : "+ Integer.toHexString(num));
        System.out.println("Octagonal : "+ Integer.toOctalString(num));
        // TODO code application logic here
    }
    
}
