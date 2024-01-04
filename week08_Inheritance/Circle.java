package week08_Inheritance;

public class Circle {
    private double radius=1.0;
    private String color="red";

    Circle(){
        this(1.0);
    }
    Circle(double radius){
        this(radius,"red");
    }
    Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    void setRadius(double radius){
        this.radius=radius;
    }
    void setColor(String color){
        this.color=color;
    }

    double getRadius(){
        return radius;
    }
    String getColor(){
        return color;
    }
    double getArea(){
        return 3.14*radius*radius;
    }
    @Override
    public String toString() {
        return "Circle Area= "+getArea()+" Radius ="+radius+" Color= "+color;
    }
}
