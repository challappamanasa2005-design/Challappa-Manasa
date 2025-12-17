import java.util.*;
class Demo{
    int a,b,c;
    void add(){
        a=10;
        b=20;c=a+b;
        System.out.println(c);
    }
}
public class Examplemethod {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.add();
    }
}
