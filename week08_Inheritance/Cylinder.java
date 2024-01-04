package week08_Inheritance;

public class Cylinder extends Circle{
    private double height=1.0;

    Cylinder(){
        this(1.0);
    }
    Cylinder(double height){
        this(height,1.0);
    }
    Cylinder(double height,double radius){
        this(height,radius,"red");
    }
    Cylinder(double height,double radius,String color){
        this.height=height;
        setRadius(radius);
        setColor(color);
    }
    void setHeight(double height){
        this.height=height;
    }
    double getHeight(){
        return height;
    }
    double getVolume(){
        return getArea()*height;
    }
    @Override
    public String toString() {
        return "Cylinder Volume="+getVolume() + " " + super.toString();
    }
}
