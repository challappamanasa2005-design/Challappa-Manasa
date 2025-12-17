import java.util.*;
class Demo{
    int a,b;
    Demo(int a,int b){
        this.a=a;
        this.b=b;
    }
    Demo(){
        a=10;
        b=20;
    }
}
class Demo1 extends Demo{
    int x,y;
    Demo1(int x,int y){
        super();
        this.x=x;
        this.y=y;
    } 
    Demo1(){
        x=100;
        y=200;
    }
    void print(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }

}
public class Exampleforinheritance1 {
    public static void main(String[] args) {
        Demo1 d=new Demo1(100,200);   
        d.print();
     }
    
}
