import java.util.*;
abstract class Plane{
 abstract void takeoff();
 abstract void fly();
abstract void land();
}
class Cargo extends Plane{
    void takeoff(){
        System.out.println("plane is taking off");
    }
    void fly(){
        System.out.println("plane is fly at low high");
    }
    void land(){
        System.out.println("plane is landed");
    }
}
    class Passanger extends Plane{
        void takeoff(){
    System.out.println("passangerplane is taking off");
     }
    void fly(){
    System.out.println("passangerplane is fly at low high");
      }
    void land(){
    System.out.println("passangerplane is landed");
      }
    }
    class Fighterplane extends Plane{
        void takeoff(){
    System.out.println("fighterplane is taking off");
     }
     void fly(){
    System.out.println("fighterplane is fly at low high");
    }
    void land(){
    System.out.println("fighterplane is landed");
     }
    }

    class Airport{
        void print(Plane ref){
            ref.takeoff();
            ref.fly();
            ref.land();
        }
    }

public class Exampleforabstract {
    public static void main(String[] args) {
        Airport a=new Airport();
        Cargo c=new Cargo();
        Passanger p=new Passanger();
        Fighterplane f=new Fighterplane();
        a.print(c);
        a.print(p);
        a.print(f);
        
    }
    
}
