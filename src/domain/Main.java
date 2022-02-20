package domain;

import java.util.*;

public class Main {

    /* This program was developed by:
        Stephen Baker ID: 2017001858
        Toni-Ann Wallace ID: 2017001545
        Meleisa Pinnock ID: 2017002015
        Kemar Norton ID: 2017001789

        Due:- 						Total marks:	50 Marks
        Date: 23/2/2022			    Lecturer: Doron Williams


        Vocational Training Development Institute
              School of Applied Technology
                    Department of ICT
      Introduction to Object-Oriented Programming II
     */

    public static void main(String[] args) throws InterruptedException {

        Scanner reader = new Scanner(System.in);
        Client Obj1 = new Client();
        Card BNS = new Card(4567, 10000, 1245,true);


        System.out.println("Pleas enter your credentials below");
        Obj1.setFirstName();
        Obj1.setLastName();
        Obj1.setAge();
        Obj1.setIdNumber();
        Obj1.setCard(BNS);


        System.out.println("Select the option to print");
        System.out.println("1: For Client \n2: Card Only");
        switch (input(reader.nextInt())) {
            case 1:
                Obj1.getFirstName();
                Obj1.getLastName();
                Obj1.getAge();
                Obj1.getIdNumber();
                Obj1.getCard();
                break;
            case 2:
                Obj1.setCard();
                Obj1.getCard();
                break;
            default: System.out.println("You did not enter a valid input");
                break;
        }

    }

    private static int input(int nextInt) {
        return nextInt;
    }

}