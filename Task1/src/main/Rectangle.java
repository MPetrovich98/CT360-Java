package main;

public class Rectangle implements Shape{
    private double sides;

    public Rectangle(double sides) throws IllegalSide {
        if(sides<=0){
            throw new IllegalSide("Sides of rectangle can't be less or equals 0.");
        }
        this.sides = sides;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "four sides lenght " + sides +
                "}";
    }

    @Override
    public double area()   {
        return sides*sides;
    }

    @Override
    public double volume() {
        return 4*sides;
    }
}
