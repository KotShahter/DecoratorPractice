/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seminar2;

/**
 *
 * @author IDTYZ
 */
abstract class BaseDishDecorator implements DishInterface {
    private DishInterface wrapee;
    
    public BaseDishDecorator(DishInterface dish)
    {
        wrapee = dish;
    }
    
    public int getPrice()
    {
        return wrapee.getPrice();
    };
    
    public String getName()
    {
        return wrapee.getName();
    };
}
