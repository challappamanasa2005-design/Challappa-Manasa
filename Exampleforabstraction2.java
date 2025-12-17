import java.util.*;
abstract class Calculator{
    abstract void sum();
    abstract void sub();
    abstract void mul();
    abstract void div();
    }
    class Mycalculator extends Calculator{
        void sum(){
            int a=10;
            int b=20;
            int sum=a+b;
            System.out.println("the sum is:"+sum);
        }
         void sub(){
     int a=30;
     int b=20;
     int sub=a-b;
     System.out.println("the sub is:"+sub);
    }
     void mul(){
     int a=10;
     int b=20;
     int mul=a*b;
     System.out.println("the product is:"+mul);
     }
      void div(){
     int a=40;
     int b=20;
     int div=a/b;
     System.out.println("the result is:"+div);
 }
    }
    class Mycalculator2 extends Calculator {
        void sum(){
            Scanner sc =new Scanner(System.in);
            System.out.println("enter a value");
            int a=sc.nextInt();
             System.out.println("enter b value");
            int b=sc.nextInt();
            int sum =a+b;
             System.out.println("the result is"+sum);
            }
            void sub(){
       Scanner sc =new Scanner(System.in);
       System.out.println("enter a value");
        int a=sc.nextInt();
        System.out.println("enter b value");
       int b=sc.nextInt();
        int sub =a-b;
        System.out.println("the result is"+sub);
       }
       void mul(){
       Scanner sc =new Scanner(System.in);
       System.out.println("enter a value");
        int a=sc.nextInt();
        System.out.println("enter b value");
        int b=sc.nextInt();
        int mul =a*b;
        System.out.println("the result is"+mul);
    }
       void div(){
      Scanner sc =new Scanner(System.in);
      System.out.println("enter a value");
      int a=sc.nextInt();
       System.out.println("enter b value");
      int b=sc.nextInt();
      int div =a/b;
      System.out.println("the result is"+div);
    }

    }
    class Result{
        void print(Calculator ref){
            ref.sum();
            ref.sub();
            ref.mul();
            ref.div();
        }
    }
public class Exampleforabstraction2 {
    public static void main(String[] args) {
        Mycalculator mc=new Mycalculator();
        Mycalculator2 mc2=new Mycalculator2();
        Result r=new Result();
        r.print(mc);
        r.print(mc2);

    }
    
}
