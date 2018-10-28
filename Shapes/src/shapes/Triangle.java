/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.util.Scanner;

/**
 *
 * @author ocdsb
 */
public class Triangle extends Shapes {
    
    
    double sideB;
    double sideC; 
    
    //constructor
    public Triangle(){
    }
    
    //add side B and C input
    @Override
    public void getInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the length of the base: ");
        this.length = input.nextDouble();
        System.out.print("Enter the height: ");
        this.height = input.nextDouble();
        System.out.print("Enter the length of one of the other sides: ");
        this.sideB = input.nextDouble();
        System.out.print("Enter the length of the last side: ");
        this.sideC = input.nextDouble();
    }
    
    public double calcPerimeter() {
        this.perimeter = length + this.sideB + sideC;
        return this.perimeter;
    }
    
    public double calcArea() {
        this.area = (length * height)/2;
        return this.area;
    }
    
    //get lengths of three sides 
    public void triangleType(double a, double b, double c){
        if(a==b && b==c){
            System.out.println("This is an equilateral triangle");
        }
        
        else if(a==b || b==c || c==a){
            System.out.println("This is an isosceles triangle");
        }
        
        else{
            System.out.println("This is a scalene triangle");
        }
    }

}

