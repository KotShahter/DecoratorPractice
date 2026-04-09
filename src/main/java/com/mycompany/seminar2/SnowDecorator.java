/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seminar2;

/**
 *
 * @author IDTYZ
 */
public class SnowDecorator extends BaseDishDecorator {
    @Override
    public int getPrice()
    {
        return wrapee.getPrice() + 40;
    }
    
    public SnowDecorator(DishInterface dish) 
    {
        super (dish);
    }
          
}
