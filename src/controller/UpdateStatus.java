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
public class UpdateStatus {
    LinkedList<Car> carList = HomePage.cars;
    public void rentCar(HomePage frame, String document, int id) {
        for(Car each: carList) {
            if(id == each.getCarId()){
                if(!each.getIsAvailable()){
                    JOptionPane.showMessageDialog(frame,each.getCarBrand()+" isn't available!");
                    return;
                }
                each.setIsAvailable(false);
                JOptionPane.showMessageDialog(frame, "You've successfully rented "+each.getCarBrand()+".\nYour Document: "+document);
            }
        }
    }
}
