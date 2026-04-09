/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seminar2;

import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author IDTYZ
 */
public class BusinessLogic {
    static public DishInterface produceDish ()
    {
        
        int selectedCount = 0;

        if (Seminar2.mainWindow.jCheckBox1.isSelected()) selectedCount++;
        if (Seminar2.mainWindow.jCheckBox2.isSelected()) selectedCount++;
        if (Seminar2.mainWindow.jCheckBox3.isSelected()) selectedCount++;
        if (Seminar2.mainWindow.jCheckBox4.isSelected()) selectedCount++;

        if (selectedCount > 3) 
        {
            JOptionPane.showMessageDialog(null, "Слишком много добавок");
            return null;
        }

        DishInterface dish = new Dish();
        
        if (Seminar2.mainWindow.jCheckBox1.isSelected()) {
            dish = new SauseDecorator(dish);
        }

        if (Seminar2.mainWindow.jCheckBox2.isSelected()) {
            dish = new DoubleMeatDecorator(dish);
        }

        if (Seminar2.mainWindow.jCheckBox3.isSelected()) {
            dish = new SnowDecorator(dish);
        }

        if (Seminar2.mainWindow.jCheckBox4.isSelected()) {
            dish = new BreadDecorator(dish);
        }
        return dish;
    }
}
