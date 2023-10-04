import java.lang.Math;
import java.util.Scanner;
public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }
    public Circle(double radius){
        if (radius>0){
            this.radius = radius;
        }else {
            this.radius = 1.0;
        }
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        if (radius>0){
            this.radius = radius;
        }
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }



}
