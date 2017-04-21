/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprogram6_9;

import java.util.Scanner;

/**
 *
 * @author Monish De
 */
public class LabProgram6_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String\n");
        String string = scanner.next();
        System.out.println(checkPositive(string));
    }

    static boolean checkPositive(String string) {
        int length = string.length();
        int index = length - 1;
        for (; index > 1; --index) {
            if (!(string.charAt(index) > string.charAt(index - 1))) {
                break;
            }
        }
        return index == 1;
    }
}
