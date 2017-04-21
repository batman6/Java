/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceexample;

/**
 *
 * @author Monish De
 */
interface EXAMPLE{
    String NAME = "Monish";
    String SEX = "Male";
    int AGE = 20;
    
    abstract class Print{
        abstract void printme();
    }
    
    class New extends Print{
        @Override
        void printme(){
            System.out.println("Name is " + NAME);
            System.out.println("Age is " + AGE);
            System.out.println("Sex " + SEX);
        }
    }
    
}
public class InterfaceExample implements EXAMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EXAMPLE.New example = new EXAMPLE.New();
        example.printme();
        
        // TODO code application logic here
    }
    
}
