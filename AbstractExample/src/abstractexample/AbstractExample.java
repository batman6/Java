/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractexample;

import java.util.Scanner;

/**
 *
 * @author Monish De
 */
abstract class Example{
    abstract void sum();
    public int a=5;

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }
    
}
class Double extends Example{
    @Override
    void sum(){
        System.out.println("SUM double " + (double)(a + 12.05));
    }
}
class Int extends Example{
    @Override
    void sum(){
        System.out.println("SUM int "+ (int)(a + 10));
}
}
public class AbstractExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double d = new Double();
        d.sum();
        Int i = new Int();
        i.sum();
        // TODO code application logic here
    }
    
}
