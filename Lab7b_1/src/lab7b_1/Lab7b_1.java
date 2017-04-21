/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7b_1;

/**
 *
 * @author Monish De
 */
abstract class BasicShape {
    
    private double area;
    
    void setArea(double area) {
        this.area = area;
    }
    
    double getArea() {
        return this.area;
    }
    
    abstract void calcArea();
}

class Circle extends BasicShape {
    
    private long centerX;
    private long centerY;
    private double radius;
    
    Circle(long centerX, long centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        calcArea();
    }
    
    long getCenterX() {
        return this.centerX;
    }
    
    long getCenterY() {
        return this.centerY;
    }
    
    @Override
    void calcArea() {
        this.setArea(3.14159 * this.radius * this.radius);
    }
}

class Rectangle extends BasicShape {
    
    private long length;
    private long width;
    
    Rectangle(long length, long width) {
        this.length = length;
        this.width = width;
        calcArea();
    }
    
    long getWidth() {
        return this.width;
    }
    
    long getLength() {
        return this.length;
    }
    
    @Override
    void calcArea() {
        this.setArea(this.length * this.width);
    }
}

public class Lab7b_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle circle = new Circle(3, 7, 4);
        circle.calcArea();
        System.out.println(circle.getArea());
        
        Rectangle rectangle = new Rectangle(4, 5);
        rectangle.calcArea();
        System.out.println(rectangle.getArea());
    }
}
