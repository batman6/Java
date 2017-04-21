/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprogram6_2;

import java.util.Scanner;

/**
 *
 * @author Monish De
 */
public class Labprogram6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        int length = str.length();
        char[] num = new char[10];
        for(int i = 0;i < length;i++){
            switch(str.charAt(i)){
                case 'a':
                case 'b':
                case 'c':
                    num[i] = '2';
                    break;
                case 'd':
                case 'e':
                case 'f':
                    num[i] = '3';
                    break;
                case 'g':
                case 'h':
                case 'i':
                    num[i] = '4';
                    break;
                case 'j':
                case 'k':
                case 'l':
                    num[i] = '5';
                    break;
                case 'm':
                case 'n':
                case 'o':
                    num[i] = '6';
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    num[i] = '7';
                    break;
                case 't':
                case 'u':
                case 'v':
                    num[i] = '8';
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    num[i] = '9';
                    break;
                case ' ':
                    num[i] = '0';
                    break;
                default:
                    num[i] = str.charAt(i);
                    break;
            }  
        }
        System.out.println("Telephone number is ");
        for(int i = 0;i < num.length;i++)
            System.out.print(num[i]+" ");
        
    }
}
        // TODO code application logic here
