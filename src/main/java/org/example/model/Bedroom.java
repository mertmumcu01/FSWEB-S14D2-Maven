package org.example.model;

import org.example.model.enums.LampType;

public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private lamp myLamp;
    private Wardrobe wardrobe;
    private Carpet carpet;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall4, Wall wall3, Ceiling ceiling, Bed bed, lamp myLamp, Carpet carpet, Wardrobe wardrobe) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall4 = wall4;
        this.wall3 = wall3;
        this.ceiling = ceiling;
        this.bed = bed;
        this.myLamp = myLamp;
        this.carpet = carpet;
        this.wardrobe = wardrobe;
    }

    public String getName() {
        return name;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Bed getBed() {
        return bed;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public lamp getMyLamp() {
        return myLamp;
    }

    public Carpet getCarpet() {
        return carpet;
    }
}
