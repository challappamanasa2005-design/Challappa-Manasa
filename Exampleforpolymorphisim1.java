import java.util.*;
class Plane{
    void takeoff(){
        System.out.println("plane is takingoff");
    }
    void fly(){
        System.out.println("plane is flying");
    }
    void land(){
        System.out.println("plane is landed");
    }
}
class Cargo extends Plane{
    void takeoff(){
    System.out.println("plane is takingoff");
}
    void fly(){
        System.out.println("cargo is flying at low high");
    }
    void specialCargo(){//specializedmethod
        System.out.println("it is special");
    }
}
class Passanger extends Cargo{
    void takeoff(){
    System.out.println("plane is takingoff");
}
    void land(){
        System.out.println("cargo landed safely");
    }
    void gone(){
        System.out.println("cargo was gone");
    }
}
class Fighter extends Passanger{
    void takeoff(){
        System.out.println("takeoff safely");  
    }
    void clash(){
        System.out.println("flight was crashed");
    }
}
class Airport1{
    void permit(Plane ref){
        ref.takeoff();
        ref.fly();
        ref.land();

    }
}
public class Exampleforpolymorphisim1{
    public static void main(String[] args) {
        Airport1 a=new Airport1();
        Cargo c=new Cargo();
        Passanger p=new Passanger();
        Fighter f=new Fighter();
        a.permit(c);
        a.permit(p);
        a.permit(f);
     
    }
}

