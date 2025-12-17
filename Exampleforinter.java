import java.util.*;
interface Calculator{
    void add();
    void sub();
}
class Mycalculator implements Calculator{
     public void add(){
     Scanner sc =new Scanner(System.in);
     System.out.println("enter a value");
     int a=sc.nextInt();
      System.out.println("enter b value");
     int b=sc.nextInt();
     int sum =a+b;
      System.out.println("the result is "+sum);
     }
    public void sub(){
     Scanner sc =new Scanner(System.in);
    System.out.println("enter a value");
  int a=sc.nextInt();
  System.out.println("enter b value");
 int b=sc.nextInt();
  int sub =a-b;
  System.out.println("the result is "+sub);
 }
 }
 class Mycalculator2 implements Calculator{
     public void add(){
     int a=10;
     int b=20;
     int sum=a+b;
     System.out.println("the sum is :"+sum);
 }
      public void sub(){
     int a=30;
     int b=20;
     int sub=a-b;
     System.out.println("the sub is :"+sub);
}
 }
public class Exampleforinter {
    public static void main(String[] args) {
        Mycalculator m1=new Mycalculator();
        Mycalculator2 m2=new Mycalculator2();
        m1.add();
        m1.sub();
        System.out.println("another method");
        m2.add();
        m2.sub();
    }
    
}
