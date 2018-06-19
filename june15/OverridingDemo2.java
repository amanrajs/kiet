package com.company.june15;

import java.util.Scanner;

abstract class Shape{
    private double dim1, dim2;
    public Shape(){}

    public Shape(double dim){
        this.dim1 = dim;
        this.dim2 = dim;
    }

    public Shape(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public double getDim1(){
        return this.dim1;
    }

    public double getDim2() {
        return dim2;
    }

    public abstract double calcArea();
}

class Rectangle extends Shape{
    private double area;

    public Rectangle(double len, double breadth){
        super(len, breadth);
    }

    //override super class method
    public double calcArea(){
        return getDim1() * getDim2();
    }
}

class Circle extends Shape{
    private double area;

    public Circle(double rad){
        super(rad);
    }

    //override super class method
    public double calcArea(){
        return 3.14 * getDim1() * getDim2();
    }
}

public class OverridingDemo2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Shape shape = null;

        System.out.println("\n\t 1. Rectangle \n\t 2. Circle");
        int choice = scan.nextInt();

        switch (choice){
            case 1:
                //..input
                shape = new Rectangle(12.20,3.4);
                break;

            case 2:
                shape = new Circle(4.40);
                break;
            default:
                System.out.println("Not Valid");
        }

        if(shape!=null){
            if(shape instanceof Rectangle)
                System.out.println("Area of Rect is : " + shape.calcArea());

            if(shape instanceof Circle)
                System.out.println("Area of Circle is : " + shape.calcArea());
        }
    }
}
