/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seminar2;

/**
 *
 * @author IDTYZ
 */
public class Dish implements DishInterface {
    private int price = 50;
    
    public void execute()
    {
        this.price = 50;
    }
    
    public int getPrice()
    {
        return price;
    }
}
