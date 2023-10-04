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

}
