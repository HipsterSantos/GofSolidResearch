package collection.module;

import java.util.ArrayList;
import java.util.List;

public class Threatre {
 private final String threatName ;
 private List<Seat> seats = new ArrayList<>();

 public Threatre(String threatName,int numRows,int seatsPerRow){
     this.threatName = threatName;
     int lastRow = 'A'+(numRows -1);
     for(char row = 'A'; row <= lastRow;row++){
         for(int seatNum = 1;seatNum <= seatsPerRow;seatNum++ ){
             Seat seat = new Seat(row+String.format("%02d",seatNum));
             seats.add(seat);
         }
     }
 }
}
