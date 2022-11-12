package Task12;

import java.util.Scanner;

public class Bus extends Main{


    private static final int busPlaces = 8;
    private int earnings;//заработок

    static String [] passengeres1 = {"Alex","Bob","Tom","Sam","Rus"};

    static void passengerList(){

        for (int i = 0; i < passengeres1.length; i++){
            System.out.println(passengeres1[i]);
        }
    }
    static void earnings(){
        int sum = 0;
        sum = passengeres1.length * 15;
        System.out.println("Заработок за рейс = " + sum + " сом");
    }


    public static void getPassenger (){
        int places;
        places = busPlaces - passengeres1.length;
        System.out.println( "свободные места в маршрутке - " + places);
        if(places == 0){
            System.out.println("свобоных мест нет!!");
        }else
            System.out.println("присаживайтесь на свободное место !");
    }

}
