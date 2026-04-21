/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seminar2;

/**
 *
 * @author IDTYZ
 */
public class SauseDecorator extends BaseDishDecorator{
    @Override
    public int getPrice()
    {
        return super.getPrice() + 20;
    }
    
    @Override
    public String getName()
    {
        return super.getName() + " с соусом";
    }
    
    public SauseDecorator(DishInterface dish) 
    {
        super (dish);
    }
        
}
