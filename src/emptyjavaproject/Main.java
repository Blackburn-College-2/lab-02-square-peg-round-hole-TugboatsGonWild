/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 *
 * @author paul.kline
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3, 4);
        Rectangle rectangle2 = new Rectangle(4, 5);
        Square square1 = new Square(5);
        Square square2 = new Square(6);
        rectangle1.toString();
        rectangle2.toString();
        square1.toString();
        square2.toString();
        Ellipse ellipse1 = new Ellipse(5, 7);
        Ellipse ellipse2 = new Ellipse(5, 3);
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(10);
        //This is an example to show that each method works
        ellipse1.getArea();
        ellipse1.getPerimeter();
        ellipse1.getEfficiency();
        circle1.getArea();
        circle1.getPerimeter();
        circle1.getEfficiency();
    }

}
