/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7b_3;

/**
 *
 * @author Monish De
 */
abstract class Shape {

    abstract int numberOfSides();
}

class Trapezoid extends Shape {

    @Override
    int numberOfSides() {
        return 4;
    }
}

class Triangle extends Shape {

    @Override
    int numberOfSides() {
        return 3;
    }
}

class Hexagon extends Shape {

    @Override
    int numberOfSides() {
        return 6;
    }
}

public class Lab7b_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Trapezoid trapezoid = new Trapezoid();
        System.out.println(trapezoid.numberOfSides());
        
        Triangle triangle = new Triangle();
        System.out.println(triangle.numberOfSides());
        
        Hexagon hexagon = new Hexagon();
        System.out.println(hexagon.numberOfSides());
    }
}
