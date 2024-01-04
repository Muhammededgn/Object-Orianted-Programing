package week09_Polymorphism;

public abstract class Shape3D extends Shape2D {
    protected double depth;
    Shape3D(double height, double widht ,double depth){
        super(height, widht);
        this.depth=depth;
    }
    Shape3D(double height, double radius){
        super(radius);
        this.height=height;
    }

    abstract double getVolume();
    
}
