package main;

import java.lang.Math;
public class Circle implements Shape {

    double radius;

    public Circle(double radius) throws IllegalRadius {
        if(radius<=0){
            throw new IllegalRadius(radius);
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public double volume() {
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
