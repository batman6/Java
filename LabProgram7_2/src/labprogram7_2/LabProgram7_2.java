/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprogram7_2;

import readData.*;

/**
 *
 * @author Monish De
 */
public class LabProgram7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringValue stringValue = new StringValue();
        IntegerValue integerValue = new IntegerValue();
        DoubleValue doubleValue = new DoubleValue();
        //calling methods

        stringValue.readString();
        integerValue.readInteger();
        doubleValue.readDouble();
        
    }

}
