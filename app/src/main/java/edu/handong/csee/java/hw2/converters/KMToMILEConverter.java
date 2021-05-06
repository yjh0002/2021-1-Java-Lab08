package edu.handong.csee.java.hw2.converters;

/**
 * This is a class of KMToMILEConverter that converts KM to MILE.
 */
public class KMToMILEConverter implements Convertible {

    private double mile;
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
        return mile;
    }
    /**
     * This is a method that converts the value from km to mile by dividing 1.6.
     */
    public void convert(){
        mile = this.fromValue/1.6;
    }
}