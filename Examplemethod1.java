import java.util.*;
class Demo{
    int a,b,c;
    void add(int a,int b){
        c=a+b;
        System.out.println(c);
    }
}
public class Examplemethod1 {
    public static void main(String[] args) {
     Demo d=new Demo();
    d.add(10,20);
}
}
