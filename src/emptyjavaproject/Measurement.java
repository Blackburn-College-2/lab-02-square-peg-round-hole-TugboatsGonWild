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
public class Measurement {
//list of attributes

    private double value;
    private double value2;
    private String unit;

    //setting them
    
    public Measurement(double v, double v2, String u) {
        value = v;
        value2 = v2;
        unit = u;
    }

    public String toString(double value, double value2, String unit) {
        if (value == value2) {
            String s = value + " " + unit;
            return s;
        } else {
            String s = value + " " + unit + " by " + value2 + unit;
            return s;
        }
    }

}
