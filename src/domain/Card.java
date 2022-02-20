package domain;
import java.util.Scanner;

public class Card {
    private int cardNUmber = 45678;
    private double balance;
    private int pin;
    private boolean status = true;

    Scanner Obj1 = new Scanner(System.in);

    public Card()
    {

    }

    public Card(int cNUmber, double bal, int pinCode, boolean stat)
    {
        this.cardNUmber = 45678;
        this.balance = bal;
        this.pin = pinCode;
        this.status = stat;
    }

    //Setters
    public void setCardNUmber(int cNum) {
      this.cardNUmber = cNum;
    }

    public void setBalance(double bal) {
        System.out.print("Enter balance: ");
        bal = Obj1.nextInt();
        this.balance = bal;
    }

    public void setPin(int pinCode) {

        System.out.print("Enter Pin: ");
        pinCode = Obj1.nextInt();
        this.pin = pinCode;
    }

    public void setStatus(boolean stat) {
        this.status = stat;
    }

    // Getters
    public int getCardNUmber() {
        System.out.println("Card #: "+ cardNUmber);
        return cardNUmber ;
    }

    public double getBalance() {
        System.out.println("Balance: "+ balance);
        return balance;
    }

    public int getPin() {
        System.out.println("");
        return pin;
    }

    public boolean isStatus() {
        if(status == true && cardNUmber == 45678){
            System.out.print("Active: ");
        }
        else
        {
            System.out.println("Card Status: Deactivated");
        }
        return status;
    }

    public void display(){

        System.out.println(isStatus());

    }

    public void setCardNUmber() {
    }

    public void setStatus() {
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return Double.compare(card.balance, balance) == 0 && pin == card.pin && status == card.status && Objects.equals(cardNUmber, card.cardNUmber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNUmber, balance, pin, status);
    }*/
}
