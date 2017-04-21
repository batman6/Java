/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprogram6_6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Monish De
 */
public class LabProgram6_6 {
    public static boolean validateUserName(String username){
        char[] chars = new char[15]; 
        boolean flag = false;
        chars = username.toCharArray();
        int count = 0;
        if(username.endsWith("_job") == true){
            for(int i=0;i<chars.length;i++){
                count++;
                if(chars[i] == '_'){
                    break;
                }
            }
            if(count >= 8){
                flag = true;
            }
        }
        else
            flag = false;
        return flag;
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        System.out.println("Enter UserName ");
        username = scanner.nextLine();
        System.out.println(validateUserName(username));
        // TODO code application logic here
    }
    
}
