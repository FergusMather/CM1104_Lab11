/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author 1812962
 */
public class Car {  
    String make;
    int mileage;
    boolean petrol;
    Person driver;
    
    public Car(String carMake,int miles,boolean petrolFueled,Person theDriver){
        make = carMake;
        mileage = miles;
        petrol = petrolFueled;
        driver = theDriver;        
    }
    
}
