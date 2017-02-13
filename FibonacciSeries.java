/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacciseries;

import java.util.Scanner;

/**
 *
 * @author Monish De
 */

public class FibonacciSeries {

    
    
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n,a=0,b=1,sum;
        System.out.println("Range of Fibonacci Series");
        n = scanner.nextInt();
        System.out.print(a+" "+b);
        for(int i=1;i<=n;i++){
            sum = a+b;
            System.out.print(" "+sum);
            a=b;
            b=sum;
        }
        // TODO code application logic here
    }
    
}
