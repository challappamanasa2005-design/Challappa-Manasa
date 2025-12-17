import java.util.*;
public class Threed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age[][][]=new int[2][3][5];
        for(int i=0;i<age.length;i++){
            for(int j=0;j<age[i].length;j++){
                for(int k=0;k<age[i][j].length;k++){
                    System.out.println("enter the age of the student "+i+"classroom "+j+"of Branch"+k);
                    age[i][j][k]=sc.nextInt();
                }
            }
        }
         for(int i=0;i<age.length;i++){
     for(int j=0;j<age[i].length;j++){
         for(int k=0;k<age[i][j].length;k++){
             System.out.println(age[i][j][k]);
         }
     }
 }
    }
}
