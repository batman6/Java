/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprogram3;

import java.util.Scanner;

/**
 *
 * @author Monish De
 */
public class LabProgram3 {
    public static class function{
        static void printme(String str){
            System.out.println(str);}
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        function obj = new function();
        Scanner scanner = new Scanner (System.in);
        String str2 = scanner.nextLine();
        obj.printme(str2);
        
        // TODO code application logic here
    }
    
}
