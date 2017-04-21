/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execptionexample;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author Monish De
 */
public class ExecptionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            int choice = 2;
            switch(choice){
                case 1:
                    int a = 17;
                    if(a < 18)
                        throw new IOException("NOT ELIGIBLE");
                    break;
                case 2:
                    int[] arr = new int[5];
                    System.out.println(arr[5]);
                    break;
                case 3:
                    int d = 10;
                    int b = 0;
                    int c = d / b;
                    break;
            }
        }catch(IOException|ArithmeticException|ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
            finally{
                    System.out.println("Program runs Successfully");
                    }
        }
        // TODO code application logic here
    }
