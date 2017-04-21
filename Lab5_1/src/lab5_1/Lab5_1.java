/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_1;

/**
 *
 * @author Monish De
 */
class Final {

    int i;

    Final(int i) {
        this.i = i;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.print("Finalizing " + i);
        super.finalize();
    }
}

public class Lab5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            // TODO code application logic here
            Final f = new Final(10);
            Final f1 = new Final(20);
            //f.finalize();
            //We can call finalize method like object.finalize() or use Runtime.runFinalizersOnExit(true) which will run finalize on all the objects
            //Runtime.runFinalizersOnExit(true);
            //Show Garbage Collector
            f = f1;
            //garbage collector will run finalize of t as it is abandoned now
            System.gc();

        } catch (Throwable ex) {

        }
    }

}
