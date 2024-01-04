package week09_Polymorphism;

public class Sphere extends Shape3D{
    Sphere(double radius){
        super(radius, radius);
    }
    
    @Override
    double getArea(){
        return radius*radius*PI;
    }

    @Override
    double getVolume(){
        return getArea()*radius*4.0/3.0;
    }
}
