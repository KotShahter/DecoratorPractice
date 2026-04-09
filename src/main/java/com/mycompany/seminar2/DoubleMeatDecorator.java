/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seminar2;

/**
 *
 * @author IDTYZ
 */
public class DoubleMeatDecorator extends BaseDishDecorator{
    @Override
    public int getPrice()
    {
        return wrapee.getPrice() + 80;
    }
    
    public DoubleMeatDecorator(DishInterface dish) 
    {
        super (dish);
    }
   
    
}
