/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprogram6_3;

import java.util.Scanner;

/**
 *
 * @author Monish De
 */
public class Labprogram6_3 {
    
    static String getImage(String str){
        StringBuffer stringBuffer = new  StringBuffer(str);
        stringBuffer.reverse();
        return stringBuffer.toString();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter String to be reversed ");
       String strtorev = scanner.nextLine();
       System.out.println(strtorev + "|" + getImage(strtorev));
        // TODO code application logic here
    }
    
}
