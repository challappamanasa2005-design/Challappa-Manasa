import java.util.*;
public class Oned {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int age[]=new int[5];
        for(int i=0;i<age.length;i++){
        System.out.println("enter age of the student:"+ i);
        age[i]=sc.nextInt(); 
        }
        System.out.println("age of the students:");
        for(int i=0;i<age.length;i++){
           System.out.println(age[i]);
        }
    }
}
