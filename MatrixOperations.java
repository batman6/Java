/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixoperations;

import java.util.Scanner;

/**
 *
 * @author Monish De
 */
public class MatrixOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int choice,rows,columns;
        System.out.println("Enter nos of rows and column");
        rows = scanner.nextInt();
        columns = scanner.nextInt();
        int[][] matA = new int[rows][columns];
        int[][] matB = new int[rows][columns];
        int[][] matC = new int[rows][columns];
        System.out.println("Enter Mat B");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matA[i][j] = scanner.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matB[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter your choice as 1,2,3,4,5");
        System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Divide\n5.Exit");
        
        // TODO code application logic here
    }
    
}
