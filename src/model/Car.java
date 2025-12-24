/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sachinsigdel
 */
public class Car {
    private int carId;
    private String carBrand;
    private String carColor;
    private double rentPerDay;
    private boolean isAvailable;
    
    public Car(int carId, String carBrand, String carColor, double rentPerDay, boolean isAvailable) {
        this.carId = carId;
        this.carBrand = carBrand;
        this.carColor = carColor;
        this.rentPerDay = rentPerDay;
        this.isAvailable = isAvailable;
    }
    
    public void setCarId(int carId){
        this.carId = carId;
    }
    
    public int getCarId(){
        return this.carId;
    }
    
    public void setCarBrand(String carBrand){
        this.carBrand = carBrand;
    }
    
    public String getCarBrand(){
        return this.carBrand;
    }
    
    public void setCarColor(String carColor){
        this.carColor = carColor;
    }
    
    public String getCarColor(){
        return this.carColor;
    }
    
    public void setRentPerDay(double rentPerDay){
        this.rentPerDay = rentPerDay;
    }
    
    public double getRentPerDay(){
        return this.rentPerDay;
    }
    
    public void setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }
    
    public boolean getIsAvailable(){
        return this.isAvailable;
    }
}
