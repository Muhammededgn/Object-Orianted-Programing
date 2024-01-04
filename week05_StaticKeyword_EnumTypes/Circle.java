package week05_StaticKeyword_EnumTypes;

public class Circle {
    static private double Pi=3.141519;
    private int radius;
    
    Circle(){}

    Circle(int radius){
        this.radius=radius;
    }

    void set_radius(int radius){
        this.radius=radius;
    }   
    
    double computeArea(){
        double area;
        area=Pi*radius*radius;
        return area;
    }

}
