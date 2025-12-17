import java.util.*;
class Car{
    private int mailage;
    private String colour;
    private String name;
    void setData(int m,String c,String n){
     mailage=m;
      colour=c;
      name=n;
    }
      public int getmailage(){
        return mailage;
      }
      public String getcolour(){
        return colour;
      }
    public String getname(){
        return name;
    }
}
public class Exampleforcar {
    public static void main(String[] args) {
        Car ca=new Car();
        ca.setData(40,"black","Toyota");
        System.out.println("mailage of the car:"+ca.getmailage());
        System.out.println("colour of the car:"+ca.getcolour());
        System.out.println("name of the car:"+ca.getname());
    }
    
}
