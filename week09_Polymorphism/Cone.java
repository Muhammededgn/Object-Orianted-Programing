package week09_Polymorphism;

public class Cone extends Shape3D {
    Cone(double height,double radius){
        super(height, radius);
    }

    @Override
    double getArea() {
        return radius*radius*PI;
    }

    @Override
    double getVolume() {
        return getArea()*height/3.0;
    }
}
