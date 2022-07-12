package main;
import java.util.Arrays;
import java.util.Scanner;

public class Triangle implements Shape {
    private double[] sieds = new double[3];

    public Triangle() throws IllegalSide {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Input "+(i+1)+". side of triangle.");
            double n=scanner.nextDouble();
            if (n<=0){
                throw new IllegalSide(n);
            }
            sieds[i]=n;
        }
    }

    public double[] getSieds() {
        return sieds;
    }
    public double getSieds1() {
        return sieds[0];
    }
    public double getSieds2() {
        return sieds[1];
    }
    public double getSieds3() {
        return sieds[2];
    }

    public void setSieds(double[] sieds) {
        this.sieds = sieds;
    }
    public void setSieds1(double n) throws IllegalSide {
        sieds[0]=n;
        if(sieds[0]<=0){
            throw new IllegalSide(sieds[0]);
        }
    }
    public void setSieds2(double n) throws IllegalSide {
        if(sieds[0]<=0){
            throw new IllegalSide(sieds[0]);
        }
    }
    public void setSieds3(double n) {
        sieds[2]=n;
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "sieds=" + Arrays.toString(sieds) +
                '}';
    }

    @Override
    public double area()  {
        double p = volume()/2;

        return Math.sqrt(p*((p-sieds[0])*(p-sieds[1])*(p-sieds[2])));
    }

    @Override
    public double volume() {

        return sieds[0] + sieds[1] + sieds[2] ;
    }
}
