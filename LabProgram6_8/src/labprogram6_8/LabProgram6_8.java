/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprogram6_8;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Monish De
 */
public class LabProgram6_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Choice :\nA: Add the String to itself  \n"
                + "B: Replace alternate positions with *  \n"
                + "C: Remove duplicate characters in the String  \n"
                + "D: Change alternate characters to upper case ");
        char ch = scanner.next().trim().charAt(0);
        System.out.print("Enter a String\n");
        String string = scanner.next();
        System.out.println(changeString(string, ch));
    }

    static String changeString(String string, char ch) {
        StringBuilder sb = null;
        int length;
        switch (ch) {
            case 'A':
                sb = new StringBuilder();
                sb.append(string.concat(string));
                break;
            case 'B':
                sb = new StringBuilder();
                length = string.length();
                for (int index = 0; index < length - 1; ++index) {
                    if (index % 2 == 0) {
                        sb.append("*");
                    } else {
                        sb.append(string.charAt(index));
                    }
                }
                break;
            case 'C':
                sb = new StringBuilder();
                char[] chars = string.toCharArray();
                Set<Character> charSet = new LinkedHashSet<>();
                for (char c : chars) {
                    charSet.add(c);
                }
                for (Character character : charSet) {
                    sb.append(character);
                }
                break;
            case 'D':
                sb = new StringBuilder();
                length = string.length();
                for (int index = 0; index < length; ++index) {
                    if (index % 2 == 0) {
                        sb.append(Character.toUpperCase(string.charAt(index)));
                    } else {
                        sb.append(string.charAt(index));
                    }
                }
                break;
            default:
                System.out.println("Enter Valid Choice");
        }
        return sb.toString();
    }
}
