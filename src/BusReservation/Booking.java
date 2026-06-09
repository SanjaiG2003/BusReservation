package BusReservation;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Booking {
    String passengername;
    int busno;
    Date date;

Booking(){
    Scanner input= new Scanner(System.in);
    System.out.println("Enter name of the passenger");
    passengername = input.nextLine();

    System.out.println("Enter Bus no");
    busno = input.nextInt();

    System.out.println("Enter Date in format dd-mm-yyyy");
    String dateinput = input.next();
    SimpleDateFormat dataformat = new SimpleDateFormat("dd-MM-yyyy");
    try {
        date = dataformat.parse(dateinput);
    } catch (ParseException e) {
        throw new RuntimeException(e);
    }

}
public boolean isAvailable(ArrayList<Booking> bookings , ArrayList<Bus> buses){
    int capacity = 0;
    for(Bus bus : buses){
        if(bus.getBusno() == busno) {
            capacity = bus.getcapacity();
        }
    }

    int booked = 0;
    for(Booking b : bookings){
        if(b.busno == busno &&b.date.equals(date)){
            booked++;
        }
    }
    return booked<capacity?true: false;
  }
}
