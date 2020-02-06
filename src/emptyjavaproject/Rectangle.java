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
public class Rectangle {
//list of attributes

    private int width;
    private int height;
    private String unit = "meters";
    private Measurement measure;
    String string = " ";

    public Rectangle(int width, int height) {
        if (height == width) {
            return;
        } else {
            System.out.println("New Rectangle: " + width + " by " + height);
        }

    }

    @Override
    public String toString() {
        measure = new Measurement(width, height, unit);
        string = "Rectangle of " + measure.toString(width, height, unit);
        return string;

    }

    public int getWidth(Rectangle rec) {
        return rec.width;
    }

    public int getHeight(Rectangle rec) {
        return rec.height;
    }
}
