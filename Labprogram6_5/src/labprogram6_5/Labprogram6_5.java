/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprogram6_5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Monish De
 */
public class Labprogram6_5 {

    static void modifyString(String s1, String s2) {
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);
        StringBuilder sb3 = new StringBuilder();
        //Operation1
        for (int i = 0; i < sb1.length(); i++) {
            if (i % 2 == 0) {
                sb3.append(s2);
            } else {
                sb3.append(s1.charAt(i));
            }

        }
        System.out.println(sb3.toString());

        //Operation2
        StringBuilder sb4 = new StringBuilder();
        int lastindex = 0;
        int count = 0;
        while (lastindex != -1) {

            lastindex = s1.indexOf(s2,lastindex);
            if (lastindex != -1) {
                count++;
                lastindex += s2.length();
            }
        }
        if(count >= 2){
            int start = s1.lastIndexOf(s2);
            sb4.append(s1.substring(0, start));
            sb4.append(sb2.reverse());
            System.out.println(sb4.toString());
        }
        else{
            String str = s1+s2;
            System.out.println(str);
        }
        
        //Operation3
        StringBuilder sb5 = new StringBuilder();
        
        if(count >= 2){
            int start = s1.indexOf(s2);
            //System.out.println(start);
            sb5.append(s1.substring(0,start));
            sb5.append(s1.substring(start+s2.length()));
            System.out.println(sb5.toString());
        }
        else
            System.out.println(s1);
        
        //Operation4
        StringBuilder sb6 = new StringBuilder();
        char[] s2char = new char[10];
        s2char = s2.toCharArray();
        int mid = (s2.length())/2;
        for(int i=0;i<mid;i++){
            sb6.append(s2char[i]);
        }
        sb6.append(s1);
        for(int i=mid;i<s2.length();i++){
            sb6.append(s2char[i]);
        }
        System.out.println(sb6.toString());
        
        //Operation5
        StringBuilder sb7 = new StringBuilder();
        char[] s1char = new char[10];
        s1char = s1.toCharArray();
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s1char[i] == s2char[j]){
                    s1char[i] = '*';
                }
            }
            sb7.append(s1char[i]);
        }
        System.out.println(sb7.toString());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter S1");
        String s1 = scanner.nextLine();
        System.out.println("Enter S2");
        String s2 = scanner.nextLine();
        modifyString(s1, s2);
        // TODO code application logic here
    }

}
