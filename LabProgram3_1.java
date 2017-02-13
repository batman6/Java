/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprogram3_1;

import java.util.Scanner;


/**
 *
 * @author Monish De
 */
public class LabProgram3_1 {
    static long regno,expense,student_campus,student_across;
    static int year;
    static float CGPA,scholarship;
    static String section;
    
    
    public static void inputs(){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Please Enter your Registrtion Number ");
        regno = scanner.nextLong();
        System.out.println("Section: ");
        section = scanner.next();
        System.out.println("CGPA is ");
        CGPA = scanner.nextFloat();
        System.out.println("Are you eligible for scholar ship: \n1.Yes\n2.No");
        int choice = scanner.nextInt();
            if(choice==1){
                scholarship=CGPA*1000;
            }
            else
                scholarship=0;
        System.out.println("Your total expenses in 4 years ");
        expense = scanner.nextLong();
        System.out.println("Enter no. of Student in your campus and across campus ");
        student_campus = scanner.nextLong();
        student_across = scanner.nextLong();
    }
    public static void display(){
        System.out.println("You are a student with Register Number "+regno+" and you belong to "+section+" and "
                + "eligible for a scholarship of "+scholarship+" per year as your CGPA is "+CGPA+" and your total living "
                        + "expense is "+expense+". Total number of students in your campus is "+student_campus+" and across campus"
                                + " is "+student_across+".");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int choice;
        System.out.println("Enter your choice as\n1.Faculty\n2.Student");
        choice = scanner.nextInt();
        switch(choice){
            case 1:
                System.out.println("Permission denied to enter details");
                break;
            case 2:
                inputs();
                display();
                break;
        }
        // TODO code application logic here
    }
    
}
