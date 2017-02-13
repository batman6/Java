/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package average;

import java.util.Scanner;

/**
 *
 * @author Monish De
 */
public class Average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n,sum=0,avg;
        int[] arr;
        System.out.println("Enter Range");
        n = scanner.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
        }
        int newsum = 0;
        for(int aarr:arr) {
            newsum += aarr;
        }
        System.out.println("Average of the List is "+sum/n);
        System.out.println("Average of the List is new "+newsum/n);
        // TODO code application logic here
    }
    
}
