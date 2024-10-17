package com.company;

import java.util.*;

public class Theater {

    static final int a = 5 ;
    int b =10;

   private final String name;
    private List<Seat> seats = new ArrayList<>();

    public Theater(String name, int numRows, int seatPerRow) {
        // a++     :- initilise static variable /ot final
        this.name = name;
        int lastRow = 'A' +(numRows - 1);
        for(char row ='A'; row <= lastRow ; row ++){
            for(int seatNum =1 ;seatNum <= seatPerRow ; seatNum++){
                Seat seat = new Seat(row + String.format("%02d",seatNum));
                seats.add(seat);
            }

        }

//        public static int printValue(int irr){
//            return 1;
//        }

    }

    public boolean reserveSeat(String seat){

        Seat reservedSeat = new Seat(seat);
        int found = Collections.binarySearch(seats,reservedSeat.getSeatnum(),null);
        if(found >= 0) {
            System.out.println("You reserved Seat");
            return true;
        }else{
            System.out.println("Not Available Seat" +seat);
            return  false;
        }



    }

    public void getSeats(){

        for(Seat seat :seats){
            System.out.println(seat.getSeatnum());
        }
    }


    private class Seat{
        public String seatnum;
        public Seat(String seatnum){
            this.seatnum = seatnum;
        }

        public String getSeatnum(){
            return this.seatnum;
        }



    }
}
