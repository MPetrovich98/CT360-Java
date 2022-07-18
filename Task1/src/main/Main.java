package main;



public class Main {
    public static void validTrinagle(double[] arr) throws IllegalSide {

        if (arr[0]>arr[1] && arr[0]>arr[2]){
            if (arr[0]>arr[1]+arr[2]){
                throw new IllegalSide("Any two sides needs to be grater than the other side");
            }
            else if (arr[1]>arr[0] && arr[1]>arr[2]){
                if (arr[1]>arr[0]+arr[2]) {
                    throw new IllegalSide("Any two sides needs to be grater than the other side");
                }
            }
            else {
                if (arr[2]>arr[1]+arr[2]) {
                    throw new IllegalSide("Any two sides needs to be grater than the other side");
                }
            }
        }

    }

    public static void main(String[] args) throws IllegalRadius, IllegalSide {
        System.out.println(System.getProperty("user.home"));
        try {
            
            System.out.println("Input radius of circle:");
            Shape circle = new Circle(5);
            System.out.println(circle.toString());
            Triangle triangle = new Triangle();
            validTrinagle(triangle.getSieds());
            System.out.println("Input sides of Rectangle");
            Shape rectangle = new Rectangle(5);
            System.out.println(rectangle.toString());
            System.out.println("Area of circle is "+circle.area());
            System.out.println("Volume of circle is "+circle.volume());
            System.out.println("Area of triangle is "+triangle.area());
            System.out.println("Volume of triangle is "+triangle.volume());
            System.out.println("Area of rectangle is "+rectangle.area());
            System.out.println("Volume of rectangle is "+rectangle.volume());
        }catch (IllegalSide | IllegalRadius e1){
            System.out.println( e1.getMessage());
        }catch (RuntimeException e2){
            System.out.println( e2.getMessage());
        }catch (Exception e3){
            System.out.println( e3.getMessage());
        }



    }


}
