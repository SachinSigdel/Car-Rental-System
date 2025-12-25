/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.LinkedList;
import model.Car;
import view.HomePage;

/**
 *
 * @author sachinsigdel
 */
public class IsIdDuplicate {
    LinkedList<Car> carList = HomePage.cars;
    public boolean isDuplicate(int id) {
        for(Car each: carList) {
            if(id == each.getCarId()) return false;
        }
        return true;
    }
}
