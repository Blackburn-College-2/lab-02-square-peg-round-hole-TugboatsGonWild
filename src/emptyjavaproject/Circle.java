/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 *
 * @author wesley.mcmillen
 */
public class Circle extends Ellipse {
//list of attributes

    private double xLength;
    private double yLength;
    private Measurement measure;

    public Circle(int x) {
        super(x, x);
        xLength = .5 * x;
        yLength = .5 * x;
        System.out.println("New Circle: Radius " + (x));
    }

}
