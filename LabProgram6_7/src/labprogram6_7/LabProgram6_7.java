/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprogram6_7;

import java.util.Scanner;

/**
 *
 * @author Monish De
 */
public class LabProgram6_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number\n");
        int number = scanner.nextInt();
        System.out.println(modifyNumber(number));
    }

    static int modifyNumber(int number) {
        String numberString = Integer.toString(number);
        StringBuffer buffer = new StringBuffer();
        char first, second;
        int a, b, c;
        char last;
        int length = numberString.length();
        for (int index = 0; index < length - 1; ++index) {
            first = numberString.charAt(index);
            second = numberString.charAt(index + 1);
            a = Character.getNumericValue(first);
            b = Character.getNumericValue(second);
            buffer.append((int)Math.abs(a-b));
        }
        last = numberString.charAt(length-1);
        c = Character.getNumericValue(last);
        buffer.append((int)c);
        return Integer.parseInt(buffer.toString());
    }
}
