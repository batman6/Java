/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergeanalysis;

import java.util.Scanner;

/**
 *
 * @author Monish De
 */
public class MergeAnalysis {

    public static int [] arr ;
    public static int [] temparr ;
    public static int length;
    
    public static void sort(int[] a){
      arr = a;
      length = a.length;
      temparr = new int[length];
      domerge(0,length-1);
    }
    
    public static void domerge(int lowerIndex,int higherIndex){
        if(lowerIndex < higherIndex){
            int middle = lowerIndex + (higherIndex - lowerIndex)/2;
            domerge(lowerIndex, middle);
            domerge(middle + 1, higherIndex);
            mergeparts(lowerIndex, middle, higherIndex);
        }
    }
    public static void mergeparts(int lowerIndex,int middle,int higherIndex){
       for(int i = lowerIndex;i <= higherIndex;i++){
           temparr[i] = arr[i];
       }
       int i = lowerIndex;
       int j = middle+1;
       int k = lowerIndex;
       while(i<=middle && j<=higherIndex){
           if(temparr[i]<=temparr[j]){
               arr[k]=temparr[i];
               i++;
           }
           else{
               arr[k]=temparr[j];
               j++;
           }
           k++;    
       }
       while(i<=middle){
           arr[k]=temparr[i];
           k++;
           i++;
       }
    }
 
    public static void main(String[] args) {
        MergeAnalysis msort;
        msort = new MergeAnalysis();
        Scanner scanner = new Scanner (System.in);
        
        int n;
        System.out.println("Enter the range of array");
        n = scanner.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            array[i] = scanner.nextInt();
        }
        long startTime = System.nanoTime();
        msort.sort(array);
        for(int i:array){
            System.out.print(i);
            System.out.print(" ");
        }
        long stopTime = System.nanoTime();
        System.out.println("Time taken is :"+(stopTime-startTime));
    }
    
}
