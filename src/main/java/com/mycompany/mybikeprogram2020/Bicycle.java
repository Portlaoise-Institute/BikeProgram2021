package com.mycompany.mybikeprogram2020;

public class Bicycle {
    
    //instance variables 
    private int cadence;
    private int speed;
    private int gear;
   
    //Multiple Constructors - constructor overloading
    
    
    // three argument constructor 
    public Bicycle(int cadence, int speed, int gear)
    {
        this.cadence = cadence;
        this.speed = speed;
        this.gear = gear;
    }
    
    //empty constructor - no arguments 
    public Bicycle(){
        this.cadence = 0;
        this.speed = 0;
        this.gear = 1;
    }
    
    
    //getter methods 
    public int getSpeed()
    {
        return speed;
    }
    
    public int getCadence()
    {
        return cadence;
    }
     
    public int getGear()
    {
        return gear;
    }
    
    
    //setter methods
    public void setCadence(int newValue) {
         this.cadence = newValue;
    }

    public void setGear(int newValue) {
         this.gear = newValue;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    //methods
    public void speedUp(int increment) {
        
        //up to max speed... 
        
         this.speed = speed + increment;   
    }

    public void applyBrakes(int decrement) {
        
        //down to min speed
        
         this.speed = speed - decrement;
    }

    //Displays the bicycle 
    public void printStates() {
        System.out.println("Cadence:" +
             cadence + " Speed:" + 
             speed + " Gear:" + gear);
    }
    
    
    public String toString(){
        return "\nCadence: "+cadence +
                "\nSpeed: "+speed+
                "\nGear: "+gear;
    } //toString
    
} //End Bicycle Class