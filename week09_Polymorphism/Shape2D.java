package week09_Polymorphism;

public abstract class Shape2D {
    protected final double PI=3.14;
    protected double height;
    protected double radius;
    protected double widht;

    Shape2D(double height , double widht){
        this.height=height;
        this.widht=widht;
    }

    Shape2D(double radius){
        this.radius=radius;
    }

    abstract double getArea();

    public String toString() {
        return super.toString();
    }

}
