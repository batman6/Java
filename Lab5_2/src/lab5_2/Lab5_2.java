/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_2;

/**
 *
 * @author Monish De
 */
public class Lab5_2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pro pro = new Pro(); // Default Constructor
        Pro pro1 = new Pro("Ayush"); // Passing string in Constructor
       
        method(2); // Method with int
        method(2.0); // Method with double
        
        Inner inner = new Inner(); 
        
        // Final Variables values cannot be changed. Final method cannot be overriden, Final Class cannot be inherited
        
    }
    
    static void method(int a) {
        System.out.println("Square = " + a*a);
    }
    
    static void method(double a) {
        System.out.println("Square = " + a*a);
    }
    
    public static class Pro {
        
        //Constructer Overloading
        
        Pro() { 
            System.out.println("Hello User");
        }
        
        Pro(String name) {
            System.out.println("Hello " + name);
        }
        
    }
    
    public static class Outer {
        
        Outer() {
            System.out.println("Outer Object Created");
        }
        
    }
    
    public static class Inner extends Outer {
            
        Inner() {
            //super(); // Actually there is no need for super here as the complier implicitly calls the the parent class
            System.out.println("Inner Object Created");
        }
           
    }
    
}