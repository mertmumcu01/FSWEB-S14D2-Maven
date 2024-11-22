package org.example.model;

public class Bed {
    private String style;
    private int height;
    private int pillows;
    private int sheets;
    private int quilt;

    public Bed(String style, int quilt, int sheets, int pillows) {
        this.style = style;
        this.quilt = quilt;
        this.sheets = sheets;
        this.pillows = pillows;
    }
    public void make(){
        System.out.println("The bed is being made");
    }
    public int getPillows(){
        return this.pillows;
    }
    public int getSheets(){
        return this.pillows;
    }
    public int getQuilt(){
        return  this.quilt;
    }
    public int getHeight(){
        return this.height;
    }

}
