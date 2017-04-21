/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprogram6_10;

import java.util.Scanner;

/**
 *
 * @author Monish De
 */
public class LabProgram6_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your secret code\n");
        String string = scanner.next();
        System.out.println(validateCode(string));
    }

    private static boolean validateCode(String string) {
        boolean flag = false;
        int caps = 0, small = 0, num = 0;
        if (string.length() == 9) {
            if (string.startsWith("cod")) {
                if (string.matches(".*\\d+.*")) {
                    if (string.charAt(3) >= 'A' && string.charAt(3) <= 'Z') {
                        for (int i = 3; i < string.length(); i++) {
                            if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
                                caps++;
                            }
                            if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
                                small++;
                            }
                            if (string.charAt(i) >= '0' && string.charAt(i) <= '9') {
                                num++;
                            }
                        }
                        if (caps > small) {
                            if (caps + small + num == 6) {
                                flag = true;
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }
}
