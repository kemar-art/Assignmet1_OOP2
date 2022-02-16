package domain;
import java.util.*;


public class Client {
    private int idNumber;
    private String firstName;
    private String lastName;
    private int age;
    Card card;

    Scanner Obj1 = new Scanner(System.in);
    private Card cardNUmber;


    public Client(){}

    public Client(int idNumber, String firstName, String lastName, int age){

        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Setters

    public void setFirstName() {
        System.out.print("Enter your first name ");
        this.firstName = Obj1.nextLine();
    }


    public void setLastName() {
        System.out.print("Enter your last name ");
        this.lastName = Obj1.nextLine();
    }

    public void setAge() {
        System.out.print("Enter your Age ");
        this.age = Integer.parseInt(Obj1.nextLine());
    }

    public void setIdNumber() {
        System.out.print("Enter your ID number ");
        this.idNumber = Integer.parseInt(Obj1.nextLine());
    }

    public void setCard(Card card) {
        this.card = card;
        card.setCardNUmber(45678);
        card.setPin(1234);
        card.setBalance(10000);
        card.setStatus(false);
    }


    // Getters

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void display() {

        card.display();


    }

}
