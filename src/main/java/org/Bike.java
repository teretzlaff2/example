package org;

public class Bike {

    private int size;
    private String name;

    public void ride() {
        System.out.println("riding " + name);
    }

    public static void main (String arg[]){
        Bike firstBike = new Bike();
        firstBike.name = "raod";
        firstBike.size = 24;
        firstBike.ride();
    }

}
