import java.util.*;
class Credit{
    int cardno=1234;
    int password=994915;
}
class Hacker extends Credit{
    void print(){
        System.out.println(cardno);
        System.out.println(password);
    }
    void changeDetails(){
        cardno=22222;
        password=89876;
    }
}
public class Exampleforinheritance {
    public static void main(String[] args) {
        Hacker h=new Hacker();
        h.print();
        h.changeDetails();
        h.print();
    }
}
