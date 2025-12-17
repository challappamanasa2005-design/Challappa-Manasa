import java.util.*;
class Circle{
    float area(float r,float pi){
        return r*r*pi;
    }
    float area(int r,float pi){
        return r*r*pi;
    }
    double area(int r,double pi){
        return r*r*pi;
    }

}
public class Examplemethodover1 {
    public static void main(String[] args) {
        Circle c=new Circle();
        System.out.println(c.area(4,3.14f));
        System.out.println(c.area(5.5f,3.14f));
        System.out.println(c.area(5,3.14));
    }
    
}
