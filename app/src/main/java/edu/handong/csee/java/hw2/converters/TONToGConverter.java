package edu.handong.csee.java.hw2.converters;

/**
 * This is a class of TONToGConverter that converts TON to G.
 */
public class TONToGConverter implements Convertible {

    private double g;
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
        return g;
    }
    /**
     * This is a method that converts the value from ton to gram by multiplying 1000000.
     */
    public void convert(){
        g = this.fromValue*1000000;
    }
}