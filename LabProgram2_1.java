/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprogram2_1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Monish De
 */
public class LabProgram2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a,b,c,D;
        float roots1,roots2;
        System.out.println("Enter the values of a,b,c from the equation");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        System.out.println("Value of D is ");
        D = (b*b - (4*a*c));
        System.out.println(D);
        System.out.println("Roots of the equation are ");
        roots1 = (float) ((-1*b+(sqrt(D)))/(2*a));
        roots2 = (float) ((-1*b-(sqrt(D)))/(2*a));
        System.out.println(roots1 +"\t"+roots2);
        
        // TODO code application logic here
    }
    
}
