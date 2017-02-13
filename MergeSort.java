/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import java.util.Scanner;

/**
 *
 * @author Monish De
 */
public class MergeSort {
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
        if(lowerIndex<higherIndex){
            int middle = lowerIndex + (lowerIndex - higherIndex)/2;
            domerge(lowerIndex, middle);
            domerge(middle + 1, higherIndex);
            mergeparts(lowerIndex, middle, higherIndex);
        }
    }
    public static void mergeparts(int lowerIndex,int middle,int higherIndex){
       for(int i = lowerIndex;i<higherIndex;i++){
           temparr[i] = arr[i];
       }
       int i = lowerIndex;
       int j = middle;
       int k = higherIndex;
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
           i++;
           k++;
       }
    }
 
    public static void main(String[] args) {
        MergeSort msort;
        msort = new MergeSort();
        Scanner scanner = new Scanner (System.in);
        int [] array = new int[100];
        int n;
        System.out.println("Enter the range of array");
        n = scanner.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            array[i] = scanner.nextInt();
        }
        msort.sort(array);
        for(int i:array){
            System.out.print(i);
            System.out.print(" ");
        }
    }
    
}
