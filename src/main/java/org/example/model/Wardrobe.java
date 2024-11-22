package org.example.model;

public class Wardrobe {
    private int height;
    private int width;
    private double weight;

    public Wardrobe(int width, int height, double weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public double getWeight() {
        return weight;
    }

    public void add(){
        System.out.println("Wardrobe added into bedroom");
    }



}
