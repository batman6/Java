/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprogram2_2;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Monish De
 */
public class LabProgram2_2 {
    static int n;
    static int[] arr = new int[100]; 
    static Scanner scanner = new Scanner(System.in);
    public static void inputarr(){
        System.out.println("Range of array is ");
        n = scanner.nextInt();
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
    }
    public static void displayarr(){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void search(int[] array){
        System.out.println("Enter number to be searched");
        int key = scanner.nextInt();
        for(int i=0;i<n;i++){
            if(key==array[i]){
                System.out.println("Number found, Location is "+(i+1));
                break;
            }
        }
        
    }
    public static void bubblesort(int[] array){
        for(int i=0;i<n;i++){
            for(int j=1;j<(n-i);j++){
                if(array[j-1]>array[j]){
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
                }
            }
        }
        System.out.println("Sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;
        int[] a = new int[100];
        a = arr;
        System.out.println("Enter your choice as\n 1.Insert \n 2.Display\n 3.Search\n 4.Sort(Bubble)");
        while(true){
        System.out.println("Choice: ");
        choice = scanner.nextInt();
        switch(choice){
            case 1:
                inputarr();
                break;
            case 2:
                displayarr();
                break;
            case 3:
                search(a);
                break;
            case 4:
                bubblesort(a);
                break;
            default:
                System.out.println("Wrong Choice");
                exit(0);
        }
        }
        // TODO code application logic here
    }
    
}
