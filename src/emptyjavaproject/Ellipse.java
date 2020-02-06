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
public class Ellipse {
//list of attributes

    private double xLength;
    private double yLength;
    private Measurement measure;
    private double perim;
    private double f;
    private double efficiency;

    public Ellipse(double x, double y) {
        xLength = x;
        yLength = y;
        if (x == y) {
            return;
        } else {
            System.out.println("New Ellipse: Wide " + xLength + " and Height "
                    + yLength);
        }

    }
//couldn't get them to work using Measurement so I made the getPerimeter and 
    //getArea methods work void

    public void getPerimeter() {
        if (this.xLength == this.yLength) {
            perim = 2 * Math.PI * (xLength);
        } else {
            perim = (2 * Math.PI) * Math.sqrt(((xLength * xLength) * (yLength
                    * yLength)) % 2);
        }
        System.out.println("Perimeter of an ellipse that is " + xLength
                + " by " + yLength + " is: " + perim + " meters.");
    }

    public void getArea() {
        if (this.xLength == this.yLength) {
            f = Math.PI * (xLength * xLength);
        } else {
            f = Math.PI * xLength * yLength;
        }
        System.out.println("Area is: " + f + " meters squared.");
    }

    public void getEfficiency() {
        efficiency = f / perim;
        System.out.println("Efficiency: " + efficiency);
    }

}
