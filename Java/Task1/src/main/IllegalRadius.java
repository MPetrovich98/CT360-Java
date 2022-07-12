package main;

public class IllegalRadius extends Exception{
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
