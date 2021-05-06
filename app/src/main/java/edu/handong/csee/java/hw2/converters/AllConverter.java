package edu.handong.csee.java.hw2.converters;
/**
 * This is a class containing functions that convert the number.
 */
public class AllConverter {

    private double fromValue;
    private String originalMeasure;
    private String checkKM = "KM";
    private String checkTON = "TON";

    /**
     * This is a method that used to save the value from IntegratedConverter.
     */
    public AllConverter setFromValue(double fromValue){
        this.fromValue = fromValue;
        return this;
    }
    /**
     * This is a method used to save original measure unit from IntegratedConverter.
     */
    public AllConverter setOriginalMeasure(String originalMeasure) {
        this.originalMeasure = originalMeasure;
        return this;
    }
    /**
     * This is a method used to convert the units (Km and Ton) and print out.
     */
    public void convertAndPrintOut() {
        if(originalMeasure.equals(checkKM)) {
            System.out.println(fromValue + " KM to " + fromValue*1000 + " M");
            System.out.println(fromValue + " KM to " + fromValue/1.6 + " MILE");
        }
        else if(originalMeasure.equals(checkTON)) {
            System.out.println(fromValue + " TON to " + fromValue*1000 + " KG");
            System.out.println(fromValue + " TON to " + fromValue*1000000 + " G");
        }
        else {
            System.out.println("AllConverter cannot support the measure!");
        }
    }
}
