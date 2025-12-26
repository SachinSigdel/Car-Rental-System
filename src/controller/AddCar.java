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
public class AddCar {
    IsIdDuplicate refDup = new IsIdDuplicate();
    public void addCar(LinkedList<Car> carList, HomePage frame, int id, String brand, String color, double rent, boolean isAvailable) {
        if(!refDup.isDuplicate(id)) {
            JOptionPane.showMessageDialog(frame, "The id is already used!");
            return;
        }
        carList.add(new Car(id,brand,color,rent,isAvailable));
        JOptionPane.showMessageDialog(frame, "Successfully added "+brand);
    }
}
