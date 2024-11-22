
package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(12, PaintColor.BLACK);
        Bed bed = new Bed("Modern", 4, 3, 1);
        lamp myLamp = new lamp(LampType.LEON, true, 75);
        Wardrobe wardrobe = new Wardrobe(5, 6,10);
        Carpet carpet = new Carpet(7, 8,"red");


        Bedroom bedroom = new Bedroom("Master Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, myLamp, carpet, wardrobe);


        System.out.println("Bedroom Name: " + bedroom.getName());
        System.out.println("Wall 1: " + bedroom.getWall1().getDirection());
        System.out.println("Wall 2: " + bedroom.getWall2().getDirection());
        System.out.println("Wall 3: " + bedroom.getWall3().getDirection());
        System.out.println("Wall 4: " + bedroom.getWall4().getDirection());
        System.out.println("Ceiling Color: " + bedroom.getCeiling().getColor());
        System.out.println("Lamp Style: " + bedroom.getMyLamp().getStyle());
        System.out.println("Carpet Color: " + bedroom.getCarpet().getColor());
        System.out.println("the bed is: " + bedroom.getBed());


        bedroom.getMyLamp().turnOn();
    }
}
