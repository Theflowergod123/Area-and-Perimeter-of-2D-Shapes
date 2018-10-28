/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ocdsb
 */
public class Square extends Shapes{
    
    //constructor
    public Square(){
    }
    
    //don't need height for square (override)
    @Override
    public void getInput(){
        System.out.print("\nEnter a length: ");
        this.length = checkInput();
    }
    
    public double calcPerimeter() {
        this.perimeter = 4 * length;
        return this.perimeter;
    }
    
    public double calcArea() {
        this.area = length * length;
        return this.area;
    }
    
}

