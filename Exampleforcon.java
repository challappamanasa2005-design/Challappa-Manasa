import java.util.*;
class Student{
   private  String rollno;
   private   String name;
   private String email;
   private int age;
    Student(String r,String n,String e,int a){
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
public class Exampleforcon{
    public static void main(String[] args) {
        Student s1=new Student("ak23","manasa","chall@gm.com",20);
        Student s2=new Student("ak22","Likhitha","pamur@gmail.com",21);
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
