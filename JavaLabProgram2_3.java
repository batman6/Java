/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabprogram2_3;

import java.util.Scanner;

/**
 *
 * @author Monish De
 */
public class JavaLabProgram2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] array = new int[100];
        int n;
        System.out.println("Enter Range");
        n = scanner.nextInt();
        for(int i=0;i<n;i++){
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        outer:
        for(int aarr:array) {
            sum += aarr;
            if(sum%5==0){
                continue outer;
            }
            else if(sum<0)
                break outer;     
            
            
        }
        System.out.println("Sum of array "+sum);
        

        // TODO code application logic here
    }
    
}
