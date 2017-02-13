/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringpalindrome;

import java.util.Scanner;

/**
 *
 * @author Monish De
 */
public class StringPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String str1,str2 = "";
        int length;
        str1 = scanner.nextLine();
        length = str1.length();
        for(int i=length-1;i>-1;i--){
            str2 = str2 + str1.charAt(i);
        }
        if(str1.equals(str2))
            System.out.println ("Palindrrome");
        else
            System.out.println ("Not Palindrome");
                
                
        // TODO code application logic here
    }
    
}
