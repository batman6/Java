/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprogram5;

import java.util.Scanner;

/**
 *
 * @author Monish De
 */
public class LabProgram5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String stud_name1,stud_name2;
        int marks1[] = new int[2];
        int marks2[] = new int[2];
        int total1=0,avg1=0,total2=0,avg2=0;
        System.out.println("Enter Name and Marks of  first student");
        stud_name1 = scanner.nextLine();
        for(int i=0;i<2;i++){
            marks1[i] = scanner.nextInt();
            total1+=marks1[i];
        }
        avg1 = total1/2;
        System.out.println("Total and average is");
        System.out.println(total1 + "\t" +avg1);
        System.out.println("Enter Name and Marks of  second student");
        stud_name2 = scanner.next();
        for(int j=0;j<2;j++){
            marks2[j] = scanner.nextInt();
            total2+=marks2[j];
        }
        avg2 = total2/2;
        System.out.println("Total and average is");
        System.out.println(total2 + "\t" +avg2);
        
        if(total1>total2){
        System.out.println(stud_name1 + " is the better student");
        }
        else{
        System.out.println(stud_name2 + " is the better student");    
        }
        
        // TODO code application logic here
    }
    
}
