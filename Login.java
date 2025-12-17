import java.util.*;
public class Login {
    public static void main(String[]args){
        String username1="Admin";
        int password1=1234;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter username:");
        String username=sc.next();
        if(username.equals(username1)){
            System.out.println("username correct");
            System.out.println("enter password:");
            int password=sc.nextInt();
            if(password==password1){
             System.out.println("password is correct");
            }
            else{
                System.out.println("invalid password");
            }
            System.out.println("login succesful");
         }
        else{
        System.out.println("invalid username");
    }
}
}
