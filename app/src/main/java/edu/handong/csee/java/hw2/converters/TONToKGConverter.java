package edu.handong.csee.java.hw2.converters;

/**
 * This is a class of TONToKGConverter that converts TON to KG.
 */
public class TONToKGConverter implements Convertible {

    private double kg;
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
        return kg;
    }
    /**
     * This is a method that converts the value from ton to kg by multiplying 1000.
     */
    public void convert(){
        kg = this.fromValue*1000;
    }
}