package main;


import java.util.logging.Logger;

public class IllegalRadius extends Exception{
    //final static Logger logger = new Logger("IllegalRadius");

    private double radius;

    public IllegalRadius(double radius) {
        super("Radius must be greather of 0, radius="+radius);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
