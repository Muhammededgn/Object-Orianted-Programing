package week09_Polymorphism;

public class Circle extends Shape2D {
   
    Circle(double radius){
        super(radius);
   }
   
   @Override
   double getArea(){
    return radius*radius*PI;
   }
}
