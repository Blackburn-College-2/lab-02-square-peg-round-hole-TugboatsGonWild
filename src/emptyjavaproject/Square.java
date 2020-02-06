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
public class Square extends Rectangle {
//list of attributes

    private int side;
    private String unit = "meters";
    private Measurement measure;
    String string = " ";

    public Square(int side) {
        super(side, side);
        System.out.println("New Square: " + side);

    }

    @Override
    public String toString() {
        measure = new Measurement(side, side, unit);
        string = "Square of " + measure.toString(side, side, unit);
        return string;
    }

}
