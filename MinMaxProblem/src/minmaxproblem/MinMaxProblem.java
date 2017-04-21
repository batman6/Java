/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minmaxproblem;

import java.util.Scanner;
import java.lang.Integer;

/**
 *
 * @author Monish De
 */
public class MinMaxProblem {
    private int n;
    private int [] array;
    
    MinMaxProblem(int n){
        array = new int[n];
        this.n = n;
    }
    
    int[] MinMax(int i,int j){
      int[] minMax = new int[2];
      int mid;
         
      if(i==j){
          minMax[1]=minMax[0]=array[i];
          return minMax;
      }
      else{
          if(i == j-1){
              if(array[i]<array[j]){
                  minMax[1] = array[j];
                  minMax[0] = array[i];
              }
              else{
                  minMax[0] = array[i];
                  minMax[1] = array[j];
              }
              
          }
          else{
              mid = (i+j)/2;
              int[] minMax1 = MinMax(i,mid);
              int[] minMax2 = MinMax(mid+1,j);
              
              if(minMax1[0]>minMax2[0]){
                  minMax[0]=minMax2[0];
              }
              else{
                  minMax[0]=minMax1[0];
                  
              }
              if(minMax1[1]<minMax2[1]){
                  minMax[1]=minMax2[1];
              }
              else{
                  minMax[1]=minMax1[1];
                  
              }
          return minMax;
          }
      }
      return minMax;
    }
      
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = scanner.nextInt();
        MinMaxProblem mmp = new MinMaxProblem(n);
        System.out.println(mmp.n+"Enter the Elements in the array");
        for(int i=0;i<mmp.n;i++){
            mmp.array[i] = scanner.nextInt();
        }
        int lowerbound = 0;
        int upperbound = mmp.n-1;
        int[] minMax = mmp.MinMax(lowerbound,upperbound);
        
        System.out.println("Min: " + minMax[0] + " \nMax: " + minMax[1]);
        
        // TODO code application logic here
    }
    
}
