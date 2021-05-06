package edu.handong.csee.java.hw2.converters;
/**
 * This is an interface Convertible and contains methods that are used to convert the value.
 */
public interface Convertible {
    /**
     * This is a method that used to save the value.
     */
    public void setFromValue(double fromValue);
    /**
     * This is a method used to get the converted value.
     */
    public double getConvertedValue();
    /**
     * This is a method used to convert the value to different unit.
     */
    public void convert();

}