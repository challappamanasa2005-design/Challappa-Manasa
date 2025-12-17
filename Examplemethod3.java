import java.util.*;
class Demo{
    int a,b,c;
    int add(int a,int b){
        c=a+b;
        System.out.println(c);
        return c;
    }
}
public class Examplemethod3 {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.add(10,20);
    }
}
