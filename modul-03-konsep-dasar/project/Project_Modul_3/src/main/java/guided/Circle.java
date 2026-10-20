package guided;

public class Circle {
    public static final double PI = 3.14159;
    
    public static double radianToDegrees(double rads){
        return rads * 100 / PI;
    }
    
    public double r;
    
    public double area() {
        return PI * r * r;
    }
    
    public double circumference(){
        return 2 * PI * r;
    }
}
