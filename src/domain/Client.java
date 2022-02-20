package domain;
import java.util.*;


public class Client {
    private int idNumber;
    private String firstName;
    private String lastName;
    private int age;
    Card card;

    Scanner Obj1 = new Scanner(System.in);

    String input = "";

    public Client() {
    }

    public Client(int idNum, String fName, String lName) {

        this.idNumber = idNum;
        this.firstName = fName;
        this.lastName = lName;
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
        card.setCardNUmber();
        card.setPin(1234);
        card.setBalance(10000);
        card.setStatus();
    }

    // Getters
    public String getFirstName() {
        System.out.println("First Name: "+ firstName);
        return this.firstName;
    }

    public String getLastName() {
        System.out.println("Last Name: "+ lastName);
        return lastName;
    }

    public int getAge() {
        System.out.println("Age: "+ age);
        return age;
    }

    public int getIdNumber() {
        System.out.println("ID #: "+ idNumber);
        return idNumber;
    }

    public Card getCard() {
        card.getCardNUmber();
        card.getBalance();
        card.display();
        return card;
    }

    public void display() {
        card.display();
    }

    public void setCard() {
    }
}