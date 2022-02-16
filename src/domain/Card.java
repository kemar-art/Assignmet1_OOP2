package domain;
import java.util.Objects;
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

    public Card(int cardNUmber, double balance, int pin, boolean status)
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

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPin(int pinCode) {

        System.out.println("Create Pin:");
        pinCode = Obj1.nextInt();
        this.pin = pinCode;
    }

    public void setStatus(boolean stat) {
        this.status = stat;
    }
    // Getters

    public int getCardNUmber() {
               return cardNUmber ;
    }

    public double getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }

    public boolean isStatus() {
        return status;
    }

    public void display(){
        System.out.println(getBalance() + " "+ getCardNUmber()+" " + getPin());
        System.out.println(isStatus());


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
