/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import model.Car;
import view.HomePage;

/**
 *
 * @author sachinsigdel
 */
public class UpdateCarDetails {
    LinkedList<Car> carList = HomePage.cars;

    public void updateCarColor(HomePage frame, int id, String color){
           for(Car each: carList) {
            if(id == each.getCarId()){
                each.setCarColor(color);
                JOptionPane.showMessageDialog(frame, "Changed the color of "+each.getCarBrand()+" to "+each.getCarColor());
            }
        }
    }
    
    public void updateCarRent(HomePage frame, int id, double rentPrice) {
       for(Car each: carList) {
            if(id == each.getCarId()){
                each.setRentPerDay(rentPrice);
                JOptionPane.showMessageDialog(frame, "Changed the rent of "+each.getCarBrand()+" to "+each.getRentPerDay());
            }
        } 
    }
}
