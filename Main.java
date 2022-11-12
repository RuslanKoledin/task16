package Task12;

import java.lang.reflect.Array;
import java.util.Scanner;

import static Task12.Bus.*;

public class Main {
    public static void main(String[] args) {
        Passenger alex = new Passenger(15, "Alex", "0708 626 629");
        Passenger bob = new Passenger(15, "Bob", "0708 626 629 00");
        Passenger tom = new Passenger(15, "Tom", "0708 629");
        Passenger sam = new Passenger(15, "Sam", "0708 626 629");
        Passenger rus = new Passenger(15, "Rus", "0708 626 629");

        getPassenger();
        System.out.println("");
        System.out.println("список пассажиров "); passengerList();
        System.out.println("");
        earnings();
        System.out.println("введите имя пассажира ");
        Scanner sc = new Scanner(System.in);
        String searchPassenger = sc.nextLine();

        if (searchPassenger.equals("Alex")) {
        System.out.println(alex);
        }
        else if (searchPassenger.equals("Bob")){
                System.out.println(bob);
        }else if (searchPassenger.equals("Tom")){
            System.out.println(tom);
        }else if (searchPassenger.equals("Sam")) {
            System.out.println(sam);
        } else if (searchPassenger.equals("Rus")) {
            System.out.println(rus);
        }else {
            System.out.println("Такого пассажира нет !");
        }


    }


}
