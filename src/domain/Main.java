package domain;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Client Obj1 = new Client();



        Obj1.setFirstName();
        Obj1.setLastName();
        Obj1.setAge();
        Obj1.setIdNumber();
        //Obj1.setCard();



        System.out.println("First Name: "+Obj1.getFirstName());
        System.out.println("Last Name: "+Obj1.getLastName());
        System.out.println("Age: "+Obj1.getAge());
        System.out.println("ID#: "+Obj1.getIdNumber());
        //KSystem.out.println("Card#: "+Obj1.card);






    }
}
