
package com.mycompany.mybikeprogram2020;

/**
 *
 * @author Student
 */
public class TestBicycle {

    public static void main(String[] args) {
        // Demo bicycle class
        
        // Create two different 
        // Bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle(0,0,1);

        // Invoke methods on 
        // those objects
        bike1.setCadence(50);
        bike1.speedUp(10);
        bike1.setGear(2);
        bike1.printStates();

        bike2.setCadence(50);
        bike2.speedUp(10);         //speed now 10
        bike2.setGear(2);
        bike2.setCadence(40);
        bike2.speedUp(10);        //speed now 20 
        bike2.setGear(3);
        bike2.applyBrakes(5);     //speed now 15 
        System.out.println(bike2.toString());
    } //end main
    
} //end class
