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

//RECTANGLE 
public class Shapes {

    /**
     * @param args the command line arguments
     */
    
    //all attributes
    double length;
    double height;
    double area;
    double perimeter;
    
    //constructor
    public Shapes(){
    }
    
    //for rectangle
    public void getInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a length: ");
        this.length = checkInput();
        System.out.print("Enter a height: ");
        this.height = checkInput();
    }
    
    //verify if double
    public double checkInput(){
        Scanner input = new Scanner(System.in);
        double Input;
        while (true){
            try{
                Input=input.nextDouble();
                break;
            }
            catch (InputMismatchException e){
                input.next();
                System.out.print("try again: ");
            }
        }
        return Input;
    }
    
    //for rectangle (encapsulation)
    private double calcPerimeter() {
        this.perimeter = (2 * length) + (2 * height);
        return this.perimeter;
    }
    
    //for rectangle (encapsulation)
    private double calcArea() {
        this.area = length * height;
        return this.area;
    }
    
    //output values
    public void displayResults(){
        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + perimeter);
    }
    
    //to test classes 
    public static void main(String[] args) {
        //rectangle
        Shapes s1 = new Shapes();
        s1.getInput();
        s1.calcArea();
        s1.calcPerimeter();
        s1.displayResults();
        
        Square s2 = new Square();
        s2.getInput();
        s2.calcArea();
        s2.calcPerimeter();
        s2.displayResults();
        
        Triangle s3 = new Triangle();
        s3.getInput();
        s3.calcArea();
        s3.calcPerimeter();
        s3.displayResults();
        s3.triangleType(s3.length, s3.sideB, s3.sideC);
    }
    
}




