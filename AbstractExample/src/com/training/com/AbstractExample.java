package com.training.com;


abstract class Shape{
    private String color;
    abstract public double area();  //abstract method
    public Shape(String color){
        System.out.println("Default constructor of Shape is called");
        this.color=color;
    }

    public String getColor(){
        return color;
    }
}


class Circle extends Shape{

    private double radius;
    public Circle(String color,double radius){
        super(color);
        System.out.println("Default constructor of Circle is called");
        this.radius=radius;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Shape s1=new Circle("RED",2.2);
        System.out.println("AREA OF CIRCLE:- "+s1.area());
        System.out.println(s1);
    }
}


