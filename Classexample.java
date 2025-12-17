import java.util.*;
abstract class Vaccine{
    int age;
    String nationality;
    Vaccine(int age,String nationality){
        this.age=age;
        this.nationality=nationality;
    }
     void firstDose(){
        Object Indian;
        if(age>=18 &&nationality.equals("Indian")){
            System.out.println("your first vaccination is successful.pay 250rs");
            secondDose();
        }
     }
     void secondDose(){
        System.out.println("the second vaccination successful");
     }
     abstract  void boosterDose();

}
class Vaccinationsuccessful extends Vaccine{
    Vaccinationsuccessful(int age, String nationality) {
        super(age, nationality);
    }
    void result(){
        firstDose();
    }

    void boosterDose(){
        System.out.println("booster vaccine is succesfull");
    }
      
}

public class Classexample {
    private static final String Indian = "Indian";

    public static void main(String[] args) {
     Vaccinationsuccessful vs=new Vaccinationsuccessful(18, Indian);
     vs.result();
     vs.boosterDose();
        }
    
}
