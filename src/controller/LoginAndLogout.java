/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JOptionPane;
import view.LoginPage;
import view.HomePage;

/**
 *
 * @author sachinsigdel
 */
public class LoginAndLogout {
    public void logOut(HomePage frame) {
        LoginPage logout = new LoginPage();
        logout.setVisible(true);
        JOptionPane.showMessageDialog(frame, "Logged out successfully!");
        frame.dispose();
    }
}
