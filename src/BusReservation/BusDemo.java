package BusReservation;
import java.util.Scanner;
import java.util.ArrayList;

public class BusDemo{
    public static void main(String[]args){
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<>();

        buses.add(new Bus(1 , true , 2));
        buses.add(new Bus(2, false , 30));
        buses.add(new Bus(3 , true , 45));


        Scanner input = new Scanner(System.in);

        for(Bus b : buses){
            b.displayinfo();
        }
        int useroption = 1;
        while(useroption == 1){
            System.out.println("Enter 1 to book and 2 to exit");
            useroption = input.nextInt();

            if(useroption == 1){
                Booking booking = new Booking();
                if(booking.isAvailable(bookings , buses)){
                    bookings.add(booking);
                    System.out.println("Booking confirmed");
                }
                else{
                    System.out.println("Sorry . Bus is full try another date or bus");
                }
            }
        }

    }
}