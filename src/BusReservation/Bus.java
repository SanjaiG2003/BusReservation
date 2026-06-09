package BusReservation;

public class Bus {


    private int busno;
    private boolean AC;
    private int capacity;

    Bus(int no , boolean ac , int cap){
        this.busno = no;
        this.AC = ac;
        this.capacity = cap;
    }

    public int getcapacity(){
        return capacity;
    }

    public int getBusno(){
        return busno;
    }

    public void setCapacity(int cap){
        this.capacity = cap;
    }

    public void setAC(boolean val){
        AC = val;
    }

    public void displayinfo(){
        System.out.println("BUS NO : " + busno + " AC : " + AC + " Total capacity: " +capacity);
    }


}