/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_2;

import java.util.Scanner;

/**
 *
 * @author Monish De
 */
public class Lab8_2 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Throwable
     */
    static class MarksException extends Throwable {

        MarksException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter internal marks : ");
        int internalMarks = s.nextInt();
        System.out.println("Enter external marks : ");
        int externalMarks = s.nextInt();

        try {

            if (internalMarks > 30) {
                throw new MarksException("Internal Marks Exceeded");
            } else if (externalMarks > 70) {
                throw new MarksException("External Marks Exceeded");
            }

        } catch (MarksException e) {
            System.out.println("Exception Caught" + e);
        }

    }

}
