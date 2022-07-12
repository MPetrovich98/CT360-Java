package main;

public class IllegalSide extends Exception{
    private double perimeter;
    public IllegalSide(double perimeter)
    {
        super("Side of trinagl must be greather of 0, side=" + perimeter);
        this.perimeter = perimeter;
    }
    public IllegalSide(String message){
        super(message);
    }
    public double getPerimeter(){
        return perimeter;
    }
}
