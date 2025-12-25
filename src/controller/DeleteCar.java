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
public class DeleteCar {
    LinkedList<Car> carList = HomePage.cars; // reference to cars linked list from HomePage
    IsIdDuplicate refDup = new IsIdDuplicate(); // reference to IsIdDuplicate class to use the isDuplicate function.
    public void deleteCar(HomePage frame, int id) {
        if(refDup.isDuplicate(id)) JOptionPane.showMessageDialog(frame, "Couldn't find the car!");
        carList.remove(getIndex(id));
        JOptionPane.showMessageDialog(frame, "The car is removed successfully!");
    }
    
    public int getIndex(int id) {
        for(Car each: carList){
            if(id == each.getCarId()){
                return carList.indexOf(each);
            }
        }
        return -1;
    }
}
