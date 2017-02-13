/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.Scanner;

/**
 *
 * @author Monish De
 */
public class QuickSort {
    public static int array[];

    /**
     *
     */
    public static int length;
    
    public static void sort(int[] inputArr){
        if(inputArr == null || inputArr.length ==0){
            return;
        }
        array = inputArr;
        length = inputArr.length;
        quickSort(0,length-1);    
    }
    
    private static void quickSort(int lowerIndex, int higherIndex){
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = array[(lowerIndex+higherIndex)/2];
        while(i<=j){
            while(array[i]<pivot){
                i++;
            }
            while(array[j]>pivot){
                j--;
            }
            if(i<=j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if(lowerIndex < j)
            quickSort(lowerIndex,j);
        if(i<higherIndex)
            quickSort(i,higherIndex);
    }

    
    public static void main(String[] args) {
        QuickSort qsort = new QuickSort();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter range");
        int n = scanner.nextByte();
        int [] arr = new int[n];
        System.out.println("Enter array");
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        long startTime = System.nanoTime();
        qsort.sort(arr);
        for(int j:arr){
            System.out.print(j);
            System.out.print("");
        }
        long stopTime = System.nanoTime();
        System.out.println("Time taken is :"+(stopTime-startTime));
    }
    
}
