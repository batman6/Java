/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.Scanner;

/**
 *
 * @author Monish De
 */
public class BinarySearch {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n ;
        System.out.println("Enter the range of the array");
        n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int beg = 0,last = n-1; 
        int mid = (beg+last)/2; 
        System.out.println("Enter the number to be searched");
        int key = scanner.nextInt();
        long startTime = System.nanoTime();
        while( beg <=last ){
            if(arr[mid]<key){
                beg = mid + 1;
                mid = (beg+last)/2;
            }
            else if (arr[mid] == key ){
                System.out.println("Number found, Location is "+(mid+1));
                break;
            }
            else if (arr[mid]>key) {
                last = mid -1;
                mid = (beg +last)/2;
            }
        
        }
        if(arr[mid] != key)
                System.out.println("Number not found");
        long stopTime = System.nanoTime();
        long elapsedTime = stopTime - startTime;
        System.out.println("Time Taken is "+elapsedTime);
        // TODO code application logic here
    }
    
}
