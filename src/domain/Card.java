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

    public Card(int cardNUmber, double balance, int pin, boolean status)
    {
        this.cardNUmber = cardNUmber;
        this.balance = balance;
        this.pin = pin;
        this.status = status;
    }
    //Setters and Getters
    public void setCardNUmber(int cardNUmber) {
        this.cardNUmber = cardNUmber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    // Getters

    public int getCardNUmber() {
        return cardNUmber;
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
        //setBalance();

    }

    /* @Override
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
