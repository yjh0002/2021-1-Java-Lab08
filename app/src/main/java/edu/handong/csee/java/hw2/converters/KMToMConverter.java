package edu.handong.csee.java.hw2.converters;
/**
 * This is a class of KMToMConverter that converts KM to M.
 */
public class KMToMConverter implements Convertible {

    private double m;
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
        return m;
    }
    /**
     * This is a method used to convert the value from km to m.
     */
    public void convert(){
        m = this.fromValue*1000;
    }
}