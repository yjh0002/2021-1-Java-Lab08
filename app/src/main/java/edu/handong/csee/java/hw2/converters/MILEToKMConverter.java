package edu.handong.csee.java.hw2.converters;

/**
 * This is a class of MILEToKMConverter that converts MILE to KM.
 */
public class MILEToKMConverter implements Convertible {

    private double km;
    private double fromValue;
    /**
     * This is a method that used to save the value from IntegratedConverter.
     */
    public void setFromValue(double fromValue) {
        this.fromValue = fromValue;
    }
    /**
     * This is a method used to get the converted value.
     */
    public double getConvertedValue() {
        return km;
    }
    /**
     * This is a method that converts the value from mile to km by multiplying 1.6.
     */
    public void convert(){
        km = this.fromValue*1.6;
    }
}