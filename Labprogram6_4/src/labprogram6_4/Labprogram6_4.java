/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprogram6_4;

import java.util.Scanner;

/**
 *
 * @author Monish De
 */
public class Labprogram6_4 {

private static String shiftConsonants(String input) {
   char[] chars =input.toCharArray();
   for(int i = 0;i <chars.length;i ++){
       char ch = chars[i];
       if(ch == 'z')
           chars[i] = 'b';

       else if (ch >= 'b' && ch <= 'y' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
            ch = (char)(ch + 1);

       if(ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
           ch++;
       
       chars[i] = ch;
       }
       
    return new String(chars) ;
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String str = scanner.nextLine();
        System.out.println(shiftConsonants(str.toLowerCase()));
        // TODO code application logic here
    }
    
}
