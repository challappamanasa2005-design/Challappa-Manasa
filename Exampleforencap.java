import java.util.*;
class Student{
   private  String rollno;
   private   String name;
   private String email;
   private int age;
    public void setData(String r,String n,String e,int a){
        rollno=r;
        name=n;
        email=e;
        age=a;
    }
    public String getrollno(){
        return rollno;
    }
    public String getname(){
        return name;
    }
    public String getemail(){
        return email;
    }
    public int getage(){
        return age;
    }
}
public class Exampleforencap {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.setData("23Ak1A3623","Manasa","challappamanasa@gmail.com",20);
        s2.setData("23Ak1A3622","Likhitha","pamuri@gmail.com",20);
        System.out.println( "Student rollno:" +s1.getrollno());
        System.out.println( "Student name:" +s1.getname());
        System.out.println( "Student email:" +s1.getemail());
        System.out.println( "Student age:" +s1.getage());
        System.out.println( "Student rollno:" +s2.getrollno());
        System.out.println( "Student name:" +s2.getname());
        System.out.println( "Student email:" +s2.getemail());
        System.out.println( "Student age:" +s2.getage());

    }
    
}
