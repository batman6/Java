/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileexample;

import java.io.*;

/**
 *
 * @author Monish De
 */
public class FileExample {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        // TODO code application logic here
        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }
        write();
        
    }
    public static void write() throws IOException{
        try(
                FileWriter fw = new FileWriter("test.txt",true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw)){
            pw.println("\nHello World");
        }
    }
    
}
