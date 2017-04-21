/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Monish De
 */
class MyThread extends Thread {

    int arr[] = new int[3];
    int sum = 0;

    public MyThread(int arr[]) {
        this.arr = arr;
    }

    @Override
    public void run() {
        
        System.out.println(Thread.currentThread().getName());
        for (int e : arr) {
            System.out.println(e);
        }
        for (int i = 0; i < 3; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of this thread = " + sum);
    }
}
public class Lab9_1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int total = 0;
        int arr[] = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        MyThread t1 = new MyThread(Arrays.copyOfRange(arr, 0, 3));
        MyThread t2 = new MyThread(Arrays.copyOfRange(arr, 3, 6));
        MyThread t3 = new MyThread(Arrays.copyOfRange(arr, 6, 9));
        
        
        Thread t = new Thread() {
            
            @Override
            public void run() {
                System.out.println(9 + 3);
            }
        };
        t1.setName("First");

        ArrayList<MyThread> threadList = new ArrayList<>();
        threadList.add(t1);
        threadList.add(t2);
        threadList.add(t3);

        for (MyThread e : threadList) {
            e.start();
            try {
                e.join();
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            } finally {
                total += e.sum;
            }
        }
        System.out.println("SUM OF ALL THREADS = " + total);
        
        
        t.start();
    }
}

